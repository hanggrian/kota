package com.example.spannabletext

import android.content.Context
import android.graphics.Typeface
import android.os.Bundle
import android.support.v4.util.Pair
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
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hendraanggrian.kota.content.getColor2
import com.hendraanggrian.kota.content.toPx
import com.hendraanggrian.kota.text.*
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Example activity that mimics https://fonts.google.com.

 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        supportActionBar!!.title = SpannableStringBuilder()
                .append("Google ", FontSpan(assets, "fonts/ProductSans-Regular.ttf"), StyleSpan(Typeface.BOLD))
                .append("Fonts", FontSpan(assets, "fonts/ProductSans-Regular.ttf"))
                .apply {
                    setSpans(ForegroundColorSpan(getColor2(R.color.gray)))
                }
        R.string.app_name

        val total = 818
        textViewViewing.text = "Viewing %s of %s font families".formatSpannableString(Pair(total, arrayOf(ForegroundColorSpan(getColor2(R.color.colorAccent)))),
                Pair(total, emptyArray<Any>()))

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = Adapter(this)

        textViewCopyright.text = "© 2017 Google Inc.".toSpannableString()
                .apply {
                    setSpans(AbsoluteSizeSpan(12.toPx()))
                    putSpans("Google", { ForegroundColorSpan(getColor2(R.color.colorAccent)) })
                }

        textViewCopyright.text = "© 2017 Google Inc.".toSpannableString()
                .apply {
                    setSpans(AbsoluteSizeSpan(12.toPx()))
                    putSpans("Google", { ForegroundColorSpan(getColor2(R.color.colorAccent)) })
                }

        val url = "https://fonts.google.com"
        textViewUrl.text = ("as seen on " + url).toSpannableString()
                .apply {
                    setSpans(AbsoluteSizeSpan(12.toPx()))
                    putSpansAll("[a-z]+:\\/\\/[^ \\n]*", spans = { URLSpan(url) })
                }
        textViewUrl.movementMethod = LinkMovementMethod.getInstance()
    }

    internal class Adapter(private val context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {
        private val fonts = Font.values()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val font = fonts[position]
            holder.toolbar.title = font.title.toSpannableString()
                    .apply {
                        setSpans(ForegroundColorSpan(context.getColor2(R.color.darkGray)),
                                StyleSpan(Typeface.BOLD),
                                AbsoluteSizeSpan(14.toPx()))
                    }
            holder.toolbar.subtitle = "${font.author} ${font.stylesCount} styles)".toSpannableString()
                    .apply {
                        setSpans(AbsoluteSizeSpan(12.toPx()))
                    }
            holder.toolbar.menu.clear()
            holder.toolbar.inflateMenu(R.menu.item)
            holder.textView.text = font.example.toSpannableString()
                    .apply {
                        setSpans(FontSpan(context.assets, font.filename),
                                AbsoluteSizeSpan(24.toPx()))
                    }
        }

        override fun getItemCount(): Int = fonts.size

        internal class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var toolbar: Toolbar = itemView.findViewById(R.id.toolbar) // as Toolbar
            var textView: TextView = itemView.findViewById(R.id.textView) // as TextView
        }
    }

    private enum class Font constructor(val title: String,
                                        val author: String,
                                        val stylesCount: Int,
                                        val filename: String,
                                        val example: String) {
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