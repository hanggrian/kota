package com.hendraanggrian.support.utils.test;

import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.hendraanggrian.support.utils.view.ViewGroups;
import com.hendraanggrian.support.utils.view.Views;

import org.hamcrest.Matcher;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ViewGroupsTest {

    private static final long DELAY_COUNTDOWN = 3000;

    @Rule
    public ActivityTestRule<ViewGroupsActivity> rule = new ActivityTestRule<>(ViewGroupsActivity.class);

    @Test
    public void test1_findMultipleTags() {
        final String tag = "TAG";
        onView(withId(R.id.container)).perform(
                new ViewAction() {
                    @Override
                    public Matcher<View> getConstraints() {
                        return isAssignableFrom(ViewGroup.class);
                    }

                    @Override
                    public String getDescription() {
                        return "Adding...";
                    }

                    @Override
                    public void perform(UiController uiController, View view) {
                        ((ViewGroup) view).addView(Views.newInstance(View.class, getTargetContext(), new Views.OnCreatedListener<View>() {
                            @Override
                            public void onCreated(@NonNull View v) {
                                v.setTag(tag);
                            }
                        }));
                        ((ViewGroup) view).addView(Views.newInstance(View.class, getTargetContext(), new Views.OnCreatedListener<View>() {
                            @Override
                            public void onCreated(@NonNull View v) {
                                v.setTag(tag);
                            }
                        }));
                    }
                }, new ViewAction() {
                    @Override
                    public Matcher<View> getConstraints() {
                        return isAssignableFrom(ViewGroup.class);
                    }

                    @Override
                    public String getDescription() {
                        return "Finding...";
                    }

                    @Override
                    public void perform(UiController uiController, View view) {
                        assertEquals(ViewGroups.findViewsWithTag((ViewGroup) view, tag, true).size(), 2);
                    }
                });
    }

    @Test
    public void test2_hasView() {
        final View viewToFind = Views.newInstance(View.class, getTargetContext());
        onView(withId(R.id.container)).perform(
                new ViewAction() {
                    @Override
                    public Matcher<View> getConstraints() {
                        return isAssignableFrom(ViewGroup.class);
                    }

                    @Override
                    public String getDescription() {
                        return "Adding...";
                    }

                    @Override
                    public void perform(UiController uiController, View view) {
                        ((ViewGroup) view).addView(Views.newInstance(View.class, getTargetContext()));
                        ((ViewGroup) view).addView(Views.newInstance(LinearLayout.class, getTargetContext(), new Views.OnCreatedListener<LinearLayout>() {
                            @Override
                            public void onCreated(@NonNull LinearLayout v) {
                                v.addView(Views.newInstance(View.class, getTargetContext()));
                                v.addView(Views.newInstance(View.class, getTargetContext()));
                                v.addView(viewToFind);
                                v.addView(Views.newInstance(View.class, getTargetContext()));
                            }
                        }));
                        ((ViewGroup) view).addView(Views.newInstance(View.class, getTargetContext()));
                        ((ViewGroup) view).addView(Views.newInstance(View.class, getTargetContext()));
                        ((ViewGroup) view).addView(Views.newInstance(View.class, getTargetContext()));
                    }
                }, new ViewAction() {
                    @Override
                    public Matcher<View> getConstraints() {
                        return isAssignableFrom(ViewGroup.class);
                    }

                    @Override
                    public String getDescription() {
                        return "Finding now...";
                    }

                    @Override
                    public void perform(UiController uiController, View view) {
                        assertEquals(ViewGroups.hasView(((ViewGroup) view), viewToFind, true), true);
                    }
                });
    }

    @NonNull
    public ViewAction delay() {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isDisplayed();
            }

            @Override
            public String getDescription() {
                return "delay for " + DELAY_COUNTDOWN;
            }

            @Override
            public void perform(UiController uiController, View view) {
                final ProgressBar progressBar = rule.getActivity().progressBar;
                new CountDownTimer(DELAY_COUNTDOWN, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                            progressBar.setProgress((int) (progressBar.getMax() * millisUntilFinished / DELAY_COUNTDOWN), true);
                        } else {
                            progressBar.setProgress((int) (progressBar.getMax() * millisUntilFinished / DELAY_COUNTDOWN));
                        }
                    }

                    @Override
                    public void onFinish() {
                        progressBar.setVisibility(View.GONE);
                    }
                }.start();
                uiController.loopMainThreadForAtLeast(DELAY_COUNTDOWN);
            }
        };
    }
}