package id.co.coconutdev.beemoovee.ui.detailmovie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.co.coconutdev.beemoovee.data.Movie
import id.co.coconutdev.beemoovee.databinding.ActivityDetailMovieBinding
import jp.wasabeef.glide.transformations.BlurTransformation

class DetailMovieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    private lateinit var detailMovieBinding: ActivityDetailMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailMovieBinding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(detailMovieBinding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val id = extras.getString(EXTRA_MOVIE)
            if (id != null) {
                viewModel.setSelectedId(id)
                populateMovie(viewModel.getMovie())
            }
        }

    }

    private fun populateMovie(movie: Movie){
        detailMovieBinding.detailTitleMovie.text = movie.title
        detailMovieBinding.detailReleaseDateMovie.text = movie.releaseDate
        detailMovieBinding.detailRatingMovie.text = movie.rating.toString()
        detailMovieBinding.detailDescription.text = movie.description


        val imageRes = resources.getIdentifier(movie.imageUrl, "drawable", packageName)
        Glide.with(this)
            .load(imageRes)
            .apply(RequestOptions.bitmapTransform(BlurTransformation()))
            .into(detailMovieBinding.bgImageView)
    }
}