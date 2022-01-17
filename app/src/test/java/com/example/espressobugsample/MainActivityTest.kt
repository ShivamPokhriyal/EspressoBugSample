package com.example.espressobugsample

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.not
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun testTextView() {
        ActivityScenario.launch(MainActivity::class.java).onActivity {
            onView(withId(R.id.cover_container)).check(matches(isDisplayed()))
            onView(withId(R.id.text_view))
                .check(matches(not(isDisplayed())))
        }
    }
}