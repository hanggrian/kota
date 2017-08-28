package com.example.spannabletext

import android.content.Context
import android.graphics.Typeface
import android.os.Bundle
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
import com.hendraanggrian.kota.layoutInflater
import com.hendraanggrian.kota.res.dp
import com.hendraanggrian.kota.res.getColor2
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

        val total = 818
        textViewViewing.text = "Viewing %s of %s font families".formatSpannable(Pair(total, arrayOf(ForegroundColorSpan(getColor2(R.color.colorAccent)))),
                Pair(total, emptyArray()))

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = Adapter(this)

        textViewCopyright.text = spannableOf("© 2017 Google Inc.").apply {
            setSpans(AbsoluteSizeSpan(dp(12)))
            putSpans("Google", { ForegroundColorSpan(getColor2(R.color.colorAccent)) })
        }

        textViewCopyright.text = spannableOf("© 2017 Google Inc.").apply {
            setSpans(AbsoluteSizeSpan(dp(12)))
            putSpans("Google", { ForegroundColorSpan(getColor2(R.color.colorAccent)) })
        }

        val url = "https://fonts.google.com"
        textViewUrl.text = spannableOf("as seen on " + url).apply {
            setSpans(AbsoluteSizeSpan(dp(12)))
            putSpansAll("[a-z]+:\\/\\/[^ \\n]*", spans = { URLSpan(url) })
        }
        textViewUrl.movementMethod = LinkMovementMethod.getInstance()
    }

    internal class Adapter(private val context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {
        private val fonts = Font.values()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(context.layoutInflater.inflate(R.layout.item, parent, false))

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val font = fonts[position]
            holder.toolbar.title = spannableOf(font.title).apply {
                setSpans(ForegroundColorSpan(context.getColor2(R.color.darkGray)),
                        StyleSpan(Typeface.BOLD),
                        AbsoluteSizeSpan(dp(14)))
            }
            holder.toolbar.subtitle = spannableOf("${font.author} ${font.stylesCount} styles)").apply {
                setSpans(AbsoluteSizeSpan(dp(12)))
            }
            holder.toolbar.menu.clear()
            holder.toolbar.inflateMenu(R.menu.item)
            holder.textView.text = spannableOf(font.example).apply {
                setSpans(FontSpan(context.assets, font.filename),
                        AbsoluteSizeSpan(dp(24)))
            }
        }

        override fun getItemCount() = fonts.size

        internal class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var toolbar: Toolbar = itemView.findViewById(R.id.toolbar) // as Toolbar
            var textView: TextView = itemView.findViewById(R.id.textView) // as TextView
        }
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