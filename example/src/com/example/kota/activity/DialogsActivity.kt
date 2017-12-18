package com.example.kota.activity

import android.os.Bundle
import android.support.v7.preference.Preference
import android.support.v7.preference.PreferenceFragmentCompat
import com.example.kota.R
import kota.*
import kota.layouts.frameLayout

class DialogsActivity : NextActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Dialog"
        supportFragmentManager.replaceNow(R.id.container, Content(), OpenTransit)
    }

    class Content : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            addPreferencesFromResource(R.xml.activity_dialogs)
            find<Preference>("toast").setOnPreferenceClickListener {
                toast("Here's a toast.")
                false
            }
            find<Preference>("snackbar").setOnPreferenceClickListener {
                activity!!.contentView!!.snackbar("Here's a snackbar.")
                false
            }
            find<Preference>("alert").setOnPreferenceClickListener {
                supportAlert("Are you sure?", "Confirmation") {
                    setNoButton()
                    setYesButton { activity!!.contentView!!.snackbar("OK") }
                }.show()
                false
            }
            find<Preference>("itemsAlert").setOnPreferenceClickListener {
                supportItemsAlert(a, "Items alert", { _, i -> activity!!.contentView!!.snackbar(a[i]) }).show()
                false
            }
            find<Preference>("choiceAlert").setOnPreferenceClickListener {
                var selected: String? = null
                supportChoiceAlert(a, -1, "Single choice alert", { _, i -> selected = a[i] }) {
                    setOKButton { activity!!.contentView!!.snackbar(selected.toString()) }
                }.show()
                false
            }
            find<Preference>("multiChoiceAlert").setOnPreferenceClickListener {
                val selected = mutableListOf<String>()
                supportMultiChoiceAlert(a, null, "Multi choice alert", { _, i, isSelected -> if (isSelected) selected.add(a[i]) else selected.remove(a[i]) }) {
                    setOKButton { activity!!.contentView!!.snackbar(selected.toString()) }
                }.show()
                false
            }
            find<Preference>("customAlert").setOnPreferenceClickListener {
                supportAlert {
                    setTitle("Custom alert")
                    setView(frameLayout {

                    })
                    setCancelButton()
                    setOKButton()
                }.show()
                false
            }
            find<Preference>("progressDialog").setOnPreferenceClickListener {
                progressDialog("Please wait", "Loading...").show()
                false
            }
            find<Preference>("indeterminateProgressDialog").setOnPreferenceClickListener {
                indeterminateProgressDialog("Please wait", "Loading...").show()
                false
            }
        }
    }

    companion object {
        val a = arrayOf("One", "Two", "Three", "Four", "Five")
    }
}