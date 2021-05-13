package id.co.coconutdev.beemoovee.ui.detail

import androidx.lifecycle.ViewModel
import id.co.coconutdev.beemoovee.data.Movie
import id.co.coconutdev.beemoovee.utils.DummyData


class DetailMovieViewHolder:ViewModel() {

    private lateinit var id:String

    fun setSelectedId(selectedId:String){
        id = selectedId
    }

    fun getMovie(): Movie {
        lateinit var selectedMovie: Movie
        val movies = DummyData.generateDummyMovies()
        for (movie in movies) {
            if (movie.id == id) {
                selectedMovie = movie
            }
        }
        return selectedMovie
    }
}