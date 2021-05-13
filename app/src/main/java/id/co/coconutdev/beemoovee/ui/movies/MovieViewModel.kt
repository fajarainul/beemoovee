package id.co.coconutdev.beemoovee.ui.movies

import androidx.lifecycle.ViewModel
import id.co.coconutdev.beemoovee.data.Movie
import id.co.coconutdev.beemoovee.utils.DummyData

class MovieViewModel:ViewModel() {

    fun getMovies():List<Movie> = DummyData.generateDummyMovies()

}