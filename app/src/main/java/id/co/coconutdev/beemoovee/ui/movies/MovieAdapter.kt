package id.co.coconutdev.beemoovee.ui.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.co.coconutdev.beemoovee.data.Movie
import id.co.coconutdev.beemoovee.databinding.ItemMovieBinding
import id.co.coconutdev.beemoovee.ui.detail.DetailMovieActivity

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listMovies = ArrayList<Movie>()

    fun setMovies(movies:List<Movie>?){
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MovieViewHolder {
        val itemsAcademyBinding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return  listMovies.size
    }

    class MovieViewHolder (private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            with(binding) {
                titleMovie.text = movie.title
                releaseDateMovie.text = movie.releaseDate
                ratingMovie.text = movie.rating.toString()

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIE, movie.id)
                    itemView.context.startActivity(intent)
                }

                val imageRes = itemView.context.resources.getIdentifier(movie.imageUrl, "drawable", itemView.context.packageName)
                Glide.with(itemView.context)
                        .load(imageRes)
                        .into(imagePosterMovie)
            }
        }
    }
}