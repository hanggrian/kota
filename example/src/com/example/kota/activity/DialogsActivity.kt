package com.example.kota.activity

import android.os.Bundle
import android.support.v7.preference.Preference
import android.support.v7.preference.PreferenceFragmentCompat
import android.widget.EditText
import com.example.kota.R
import kota.*
import kota.dialogs.*

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
                supportAlert("Alert", "Easily add buttons with DialogButton", CancelButton, OkButton { activity!!.contentView!!.snackbar("OK") })
                false
            }
            find<Preference>("itemsAlert").setOnPreferenceClickListener {
                supportItemsAlert("Items alert", a, { _, i -> activity!!.contentView!!.snackbar(a[i]) })
                false
            }
            find<Preference>("choiceAlert").setOnPreferenceClickListener {
                var selected: String? = null
                supportChoiceAlert("Single choice alert", a, { _, i -> selected = a[i] }, OkButton { activity!!.contentView!!.snackbar(selected.toString()) })
                false
            }
            find<Preference>("multiChoiceAlert").setOnPreferenceClickListener {
                val selected = mutableListOf<String>()
                supportMultiChoiceAlert("Multi choice alert", a, { _, i, isSelected -> if (isSelected) selected.add(a[i]) else selected.remove(a[i]) }, OkButton { activity!!.contentView!!.snackbar(selected.toString()) })
                false
            }
            find<Preference>("customAlert").setOnPreferenceClickListener {
                supportCustomAlert("Custom alert", EditText(context), CancelButton, OkButton)
                false
            }
            find<Preference>("progressDialog").setOnPreferenceClickListener {
                progressDialog("Please wait", "Loading...")
                false
            }
            find<Preference>("indeterminateProgressDialog").setOnPreferenceClickListener {
                indeterminateProgressDialog("Please wait", "Loading...")
                false
            }
        }
    }

    companion object {
        val a = arrayOf("One", "Two", "Three", "Four", "Five")
    }
}