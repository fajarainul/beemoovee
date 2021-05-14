package id.co.coconutdev.beemoovee.ui.detailmovie

import id.co.coconutdev.beemoovee.utils.DummyData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var viewModel:DetailMovieViewModel
    private val dummyMovie = DummyData.generateDummyMovies()[0];
    private val movieId = dummyMovie.id;


    @Before
    fun setUp(){
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedId(movieId)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedId(dummyMovie.id)
        val movie = viewModel.getMovie()
        assertNotNull(movie)
        assertEquals(dummyMovie.id, movie.id)
        assertEquals(dummyMovie.title, movie.title)
        assertEquals(dummyMovie.description, movie.description)
        assertEquals(dummyMovie.imageUrl, movie.imageUrl)
        assertEquals(dummyMovie.releaseDate, movie.releaseDate)
        assertEquals(dummyMovie.rating, movie.rating, 0.0)
    }
}