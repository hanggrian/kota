package com.hendraanggrian.support.commonsutils.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
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
        setSupportActionBar(findViewById(R.id.toolbar) as Toolbar)
        progressBar = findViewById(R.id.progressBar) as ProgressBar
        container = findViewById(R.id.container) as ViewGroup
    }
}