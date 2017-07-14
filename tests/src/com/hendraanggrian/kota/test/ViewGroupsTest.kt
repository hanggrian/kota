package com.hendraanggrian.kota.test

import android.os.Build
import android.os.CountDownTimer
import android.support.test.InstrumentationRegistry.getTargetContext
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.UiController
import android.support.test.espresso.ViewAction
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.hendraanggrian.kota.view.containsView
import com.hendraanggrian.kota.view.findViewsWithTag
import org.hamcrest.Matcher
import org.junit.Assert.assertEquals
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ViewGroupsTest {

    @Rule
    var rule = ActivityTestRule(ViewGroupsActivity::class.java)

    @Test
    fun test1_findMultipleTags() {
        val tag = "TAG"
        onView(withId(R.id.container)).perform(
                object : ViewAction {
                    override fun getConstraints(): Matcher<View> {
                        return isAssignableFrom(ViewGroup::class.java)
                    }

                    override fun getDescription(): String {
                        return "Adding..."
                    }

                    override fun perform(uiController: UiController, view: View) {
                        view as ViewGroup
                        View(getTargetContext()).let {
                            it.tag = tag
                            view.addView(it)
                        }
                        View(getTargetContext()).let {
                            it.tag = tag
                            view.addView(it)
                        }
                    }
                }, object : ViewAction {
            override fun getConstraints(): Matcher<View> {
                return isAssignableFrom(ViewGroup::class.java)
            }

            override fun getDescription(): String {
                return "Finding..."
            }

            override fun perform(uiController: UiController, view: View) {
                assertEquals((view as ViewGroup).findViewsWithTag(tag, true).size, 2)
            }
        })
    }

    @Test
    fun test2_hasView() {
        val viewToFind = View(getTargetContext())
        onView(withId(R.id.container)).perform(
                object : ViewAction {
                    override fun getConstraints(): Matcher<View> {
                        return isAssignableFrom(ViewGroup::class.java)
                    }

                    override fun getDescription(): String {
                        return "Adding..."
                    }

                    override fun perform(uiController: UiController, view: View) {
                        view as ViewGroup
                        view.addView(View(getTargetContext()))
                        LinearLayout(getTargetContext()).let {
                            it.addView(View(getTargetContext()))
                            it.addView(View(getTargetContext()))
                            it.addView(viewToFind)
                            it.addView(View(getTargetContext()))
                            view.addView(it)
                        }
                        view.addView(View(getTargetContext()))
                        view.addView(View(getTargetContext()))
                        view.addView(View(getTargetContext()))
                    }
                }, object : ViewAction {
            override fun getConstraints(): Matcher<View> {
                return isAssignableFrom(ViewGroup::class.java)
            }

            override fun getDescription(): String {
                return "Finding now..."
            }

            override fun perform(uiController: UiController, view: View) {
                assertEquals((view as ViewGroup).containsView(viewToFind, true), true)
            }
        })
    }

    fun delay(): ViewAction {
        return object : ViewAction {
            override fun getConstraints(): Matcher<View> {
                return isDisplayed()
            }

            override fun getDescription(): String {
                return "delay for " + DELAY_COUNTDOWN
            }

            override fun perform(uiController: UiController, view: View) {
                val progressBar = rule.activity.progressBar!!
                object : CountDownTimer(DELAY_COUNTDOWN, 100) {
                    override fun onTick(millisUntilFinished: Long) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                            progressBar.setProgress((progressBar.max * millisUntilFinished / DELAY_COUNTDOWN).toInt(), true)
                        } else {
                            progressBar.progress = (progressBar.max * millisUntilFinished / DELAY_COUNTDOWN).toInt()
                        }
                    }

                    override fun onFinish() {
                        progressBar.visibility = View.GONE
                    }
                }.start()
                uiController.loopMainThreadForAtLeast(DELAY_COUNTDOWN)
            }
        }
    }

    companion object {

        private val DELAY_COUNTDOWN: Long = 3000
    }
}