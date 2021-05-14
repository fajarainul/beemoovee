package id.co.coconutdev.beemoovee.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import id.co.coconutdev.beemoovee.R
import id.co.coconutdev.beemoovee.utils.DummyData
import org.junit.Rule
import org.junit.Test


class MainActivityTest{

    private val movies = DummyData.generateDummyMovies()
    private val tvShows = DummyData.generateDummyTVShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies(){
        onView(withId(R.id.recyclerview_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerview_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movies.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.recyclerview_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(R.id.detail_title_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_title_movie)).check(matches(withText(movies[0].title)))

        onView(withId(R.id.detail_rating_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_rating_movie)).check(matches(withText(movies[0].rating.toString())))

        onView(withId(R.id.detail_release_date_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_release_date_movie)).check(matches(withText(movies[0].releaseDate)))

        onView(withId(R.id.detail_description)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_description)).check(matches(withText(movies[0].description)))

        onView(withId(R.id.bg_image_view)).check(matches(isDisplayed()))
    }

    @Test
    fun loadTvShows() {
        onView(withText("TV Series")).perform(click())
        onView(withId(R.id.recyclerview_tvshows)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerview_tvshows)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tvShows.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withText("TV Series")).perform(click())
        onView(withId(R.id.recyclerview_tvshows)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(R.id.detail_title_tv)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_title_tv)).check(matches(withText(tvShows[0].title)))

        onView(withId(R.id.detail_rating_tv)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_rating_tv)).check(matches(withText(tvShows[0].rating.toString())))

        onView(withId(R.id.detail_release_date_tv)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_release_date_tv)).check(matches(withText(tvShows[0].releaseDate)))

        onView(withId(R.id.detail_description)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_description)).check(matches(withText(tvShows[0].description)))

        onView(withId(R.id.bg_image_view)).check(matches(isDisplayed()))
    }
}