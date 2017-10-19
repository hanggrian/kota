package com.example.kota.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.preference.Preference
import android.support.v7.preference.PreferenceFragmentCompat
import com.example.kota.R
import kota.OpenTransit
import kota.find
import kota.replaceNow
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportFragmentManager.replaceNow(R.id.container, Content(), OpenTransit)
    }

    class Content : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            addPreferencesFromResource(R.xml.activity_main)
            find<Preference>("dialogs").setOnPreferenceClickListener {
                startActivity(Intent(context, DialogsActivity::class.java))
                false
            }
            find<Preference>("texts").setOnPreferenceClickListener {
                startActivity(Intent(context, TextsActivity::class.java))
                false
            }
        }
    }
}