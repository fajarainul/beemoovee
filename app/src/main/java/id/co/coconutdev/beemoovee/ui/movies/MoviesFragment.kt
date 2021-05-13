package id.co.coconutdev.beemoovee.ui.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import id.co.coconutdev.beemoovee.databinding.FragmentMoviesBinding
import id.co.coconutdev.beemoovee.utils.DummyData

class MoviesFragment : Fragment() {

    private lateinit var fragmentMovieBinding:FragmentMoviesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentMovieBinding = FragmentMoviesBinding.inflate(inflater, container, false);
        return fragmentMovieBinding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(activity != null){
            val movies = DummyData.generateDummyMovies()
            val movieAdapter = MovieAdapter();

            movieAdapter.setMovies(movies)
            with(fragmentMovieBinding.recyclerviewMovies){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }
}