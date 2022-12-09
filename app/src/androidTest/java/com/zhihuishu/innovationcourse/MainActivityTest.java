package com.zhihuishu.innovationcourse;

import com.zhihuishu.innovationcourse.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

//    @Rule
//    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
//            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction textView = onView(
                allOf(withId(R.id.teacher_name_textView), withText("????"),
                        withParent(withParent(withId(R.id.teacher_listView))),
                        isDisplayed()));
        textView.check(matches(withText("????")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.teacher_name_textView), withText("???"),
                        withParent(withParent(withId(R.id.teacher_listView))),
                        isDisplayed()));
        textView2.check(matches(withText("???")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.teacher_name_textView), withText("?¦Å"),
                        withParent(withParent(withId(R.id.teacher_listView))),
                        isDisplayed()));
        textView3.check(matches(withText("?¦Å")));
    }
}
