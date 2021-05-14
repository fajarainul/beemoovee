package id.co.coconutdev.beemoovee.ui.movies

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class MovieViewModelTest : TestCase() {


    private lateinit var viewModel: MovieViewModel

    @Before
    override fun setUp() {
        viewModel = MovieViewModel();
    }

    @Test
    fun testGetMovies() {
        val movies = viewModel.getMovies()
        assertNotNull(movies)
        assertEquals(10, movies.size)
    }
}