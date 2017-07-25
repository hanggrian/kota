package com.hendraanggrian.kota.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.ProgressBar

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
class ViewGroupsActivity : AppCompatActivity() {

    var progressBar: ProgressBar? = null
    var container: ViewGroup? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewgroups)
        setSupportActionBar(findViewById(R.id.toolbar))
        progressBar = findViewById(R.id.progressBar)
        container = findViewById(R.id.container)
    }
}