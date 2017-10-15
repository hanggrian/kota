package com.example.kota

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat
import android.widget.EditText
import com.example.kota.utils.findAndSetOnClickListener
import kota.OpenTransit
import kota.dialogs.*
import kota.replace
import kota.snackbar
import kota.toast
import kota.views.contentView

class DialogsActivity : NextActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Dialog"
        supportFragmentManager.replace(R.id.container, Content(), OpenTransit)
    }

    class Content : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            addPreferencesFromResource(R.xml.activity_dialogs)
            findAndSetOnClickListener("toast") { toast("Here's a toast.") }
            findAndSetOnClickListener("snackbar") { activity.contentView!!.snackbar("Here's a snackbar.") }
            findAndSetOnClickListener("alert") { supportAlert("Alert", "Easily add buttons with DialogButton", CancelButton, OkButton { activity.contentView!!.snackbar("OK") }) }
            findAndSetOnClickListener("itemsAlert") { supportItemsAlert("Items alert", a, { _, i -> activity.contentView!!.snackbar(a[i]) }) }
            findAndSetOnClickListener("choiceAlert") {
                var selected: String? = null
                supportChoiceAlert("Single choice alert", a, { _, i -> selected = a[i] }, OkButton { activity.contentView!!.snackbar(selected.toString()) })
            }
            findAndSetOnClickListener("multiChoiceAlert") {
                val selected = mutableListOf<String>()
                supportMultiChoiceAlert("Multi choice alert", a, { _, i, isSelected -> if (isSelected) selected.add(a[i]) else selected.remove(a[i]) }, OkButton { activity.contentView!!.snackbar(selected.toString()) })
            }
            findAndSetOnClickListener("customAlert") { supportCustomAlert("Custom alert", EditText(context), CancelButton, OkButton) }
        }
    }

    companion object {
        val a = arrayOf("One", "Two", "Three", "Four", "Five")
    }
}