package id.co.coconutdev.beemoovee.ui.tvshows

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest : TestCase() {

    private lateinit var viewModel: TvShowViewModel

    @Before
    override fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun testGetTvShows() {
        val tvShows = viewModel.getTvShows()
        assertNotNull(tvShows)
        assertEquals(10, tvShows.size)
    }
}