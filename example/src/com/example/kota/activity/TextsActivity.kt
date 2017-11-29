package com.example.kota.activity

import android.content.Context
import android.graphics.Typeface
import android.os.Bundle
import android.support.v4.util.PatternsCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.text.SpannableStringBuilder
import android.text.method.LinkMovementMethod
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.text.style.URLSpan
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kota.FontSpan
import com.example.kota.R
import kota.find
import kota.layoutInflater
import kota.resources.dp
import kota.resources.getColor2
import kota.text.*
import kotlinx.android.synthetic.main.activity_texts.*

/**
 * Example activity that mimics https://fonts.google.com.
 */
class TextsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_texts)
        setSupportActionBar(toolbar)

        supportActionBar!!.title = SpannableStringBuilder()
                .append("Google ", FontSpan(assets, "fonts/ProductSans-Regular.ttf"), StyleSpan(Typeface.BOLD))
                .append("Fonts", FontSpan(assets, "fonts/ProductSans-Regular.ttf"))
                .spanAll({ ForegroundColorSpan(getColor2(R.color.gray)) })

        val total = 818
        textViewViewing.text = "Viewing $total of $total font families".toSpannable().spanFirst(Regex(total.toString()), { ForegroundColorSpan(getColor2(R.color.colorAccent)) })

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = Adapter(this)

        textViewCopyright.text = "© 2017 Google Inc.".toSpannable()
                .spanAll({ AbsoluteSizeSpan(12.dp) })
                .span(Regex("Google"), { ForegroundColorSpan(getColor2(R.color.colorAccent)) })

        val url = "https://fonts.google.com"
        textViewUrl.text = ("as seen on " + url).toSpannable()
                .spanAll({ AbsoluteSizeSpan(12.dp) })
                .span(PatternsCompat.WEB_URL.toRegex(), { URLSpan(url) })
        textViewUrl.movementMethod = LinkMovementMethod.getInstance()
    }

    internal class Adapter(private val context: Context) : RecyclerView.Adapter<ViewHolder>() {
        private val fonts = Font.values()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(context.layoutInflater.inflate(R.layout.item_texts, parent, false))

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val font = fonts[position]
            holder.toolbar.title = font.title.toSpannable().spanAll({ ForegroundColorSpan(context.getColor2(R.color.darkGray)) }, { StyleSpan(Typeface.BOLD) }, { AbsoluteSizeSpan(14.dp) })
            holder.toolbar.subtitle = "${font.author} ${font.stylesCount} styles)".toSpannable().spanAll({ AbsoluteSizeSpan(12.dp) })
            holder.toolbar.menu.clear()
            holder.toolbar.inflateMenu(R.menu.activity_texts)
            holder.textView.text = font.example.toSpannable().spanAll({ FontSpan(context.assets, font.filename) }, { AbsoluteSizeSpan(24.dp) })
        }

        override fun getItemCount() = fonts.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var toolbar: Toolbar = itemView.find(R.id.toolbar)
        var textView: TextView = itemView.find(R.id.textView)
    }

    private enum class Font constructor(
            val title: String,
            val author: String,
            val stylesCount: Int,
            val filename: String,
            val example: String
    ) {
        ROBOTO("Roboto", "Christian Robertson", 12,
                "fonts/Roboto-Regular.ttf",
                "All their equipment and instruments are alive."),
        BARRIO("Barrio", "Omnibus-Type", 1,
                "fonts/Barrio-Regular.ttf",
                "I watched the storm, so beautiful yet terrific."),
        OPEN_SANS("Open Sans", "Steve Matteson", 10,
                "fonts/OpenSans-Regular.ttf",
                "Almost before we knew it, we had left the ground."),
        LATO("Lato", "Lukasz Dziedzic", 10,
                "fonts/Lato-Regular.ttf",
                "A shining crescent far beneath the flying vessel."),
        SLABO("Slabo 27px", "John Hydson", 1,
                "fonts/Slabo27px-Regular.ttf",
                "It was going to be a lonely trip back."),
        KHULA("Khula", "Eric McLaughlin", 5,
                "fonts/Khula-Regular.ttf",
                "Mist enveloped the ship three hours from port.")
    }
}