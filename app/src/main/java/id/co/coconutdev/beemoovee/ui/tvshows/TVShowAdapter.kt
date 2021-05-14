package id.co.coconutdev.beemoovee.ui.tvshows

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.co.coconutdev.beemoovee.data.TvShow
import id.co.coconutdev.beemoovee.databinding.ItemTvShowBinding
import id.co.coconutdev.beemoovee.ui.detailtv.DetailTvActivity

class TVShowAdapter: RecyclerView.Adapter<TVShowAdapter.TVShowViewHolder>() {
    private var listTVShow = ArrayList<TvShow>()

    fun setTVShow(tvShows:List<TvShow>?){
        if (tvShows == null) return
        this.listTVShow.clear()
        this.listTVShow.addAll(tvShows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TVShowAdapter.TVShowViewHolder {
        val itemsAcademyBinding = ItemTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TVShowViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: TVShowAdapter.TVShowViewHolder, position: Int) {
        val tvShow = listTVShow[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int {
        return  listTVShow.size
    }

    class TVShowViewHolder (private val binding: ItemTvShowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TvShow) {
            with(binding) {
                titleTv.text = tvShow.title
                releaseDateTv.text = tvShow.releaseDate
                ratingTv.text = tvShow.rating.toString()

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvActivity::class.java)
                    intent.putExtra(DetailTvActivity.EXTRA_TV, tvShow.id)
                    itemView.context.startActivity(intent)
                }

                val imageRes = itemView.context.resources.getIdentifier(tvShow.imageUrl, "drawable", itemView.context.packageName)
                Glide.with(itemView.context)
                    .load(imageRes)
                    .into(imagePosterTv)
            }
        }
    }
}