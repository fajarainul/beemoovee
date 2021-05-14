package id.co.coconutdev.beemoovee.ui.detailtv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.co.coconutdev.beemoovee.data.TvShow
import id.co.coconutdev.beemoovee.databinding.ActivityDetailTvBinding
import jp.wasabeef.glide.transformations.BlurTransformation

class DetailTvActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TV = "extra_tvshow"
    }

    private lateinit var detailTvBinding: ActivityDetailTvBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailTvBinding = ActivityDetailTvBinding.inflate(layoutInflater)
        setContentView(detailTvBinding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailTvShowViewHolder::class.java]
        val extras = intent.extras
        if (extras != null) {
            val id = extras.getString(EXTRA_TV)
            if (id != null) {
                viewModel.setSelectedId(id)
                populateTvShow(viewModel.getTvShow())
            }
        }

    }

    private fun populateTvShow(tvShow: TvShow){
        detailTvBinding.detailTitleTv.text = tvShow.title
        detailTvBinding.detailReleaseDateTv.text = tvShow.releaseDate
        detailTvBinding.detailRatingTv.text = tvShow.rating.toString()
        detailTvBinding.detailDescription.text = tvShow.description


        val imageRes = resources.getIdentifier(tvShow.imageUrl, "drawable", packageName)
        Glide.with(this)
            .load(imageRes)
            .apply(RequestOptions.bitmapTransform(BlurTransformation()))
            .into(detailTvBinding.bgImageView)
    }
}