package com.example.kota

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.preference.PreferenceFragmentCompat
import com.example.kota.utils.findAndSetOnClickListener
import kota.OpenTransit
import kota.replace
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportFragmentManager.replace(R.id.container, Content(), OpenTransit)
    }

    class Content : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            addPreferencesFromResource(R.xml.activity_main)
            findAndSetOnClickListener("dialogs") { startActivity(Intent(context, DialogsActivity::class.java)) }
            findAndSetOnClickListener("texts") { startActivity(Intent(context, TextsActivity::class.java)) }
        }
    }
}