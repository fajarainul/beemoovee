package id.co.coconutdev.beemoovee.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.co.coconutdev.beemoovee.R
import id.co.coconutdev.beemoovee.databinding.ActivityDetailMovieBinding
import jp.wasabeef.glide.transformations.BlurTransformation

class DetailMovieActivity : AppCompatActivity() {
    private lateinit var detailMovieBinding: ActivityDetailMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailMovieBinding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(detailMovieBinding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        Glide.with(this)
            .load(R.drawable.poster_a_star)
            .apply(RequestOptions.bitmapTransform(BlurTransformation()))
            .into(detailMovieBinding.bgImageView)
    }
}