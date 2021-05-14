package id.co.coconutdev.beemoovee.ui.detailtv

import androidx.lifecycle.ViewModel
import id.co.coconutdev.beemoovee.data.TvShow
import id.co.coconutdev.beemoovee.utils.DummyData

class DetailTvShowViewHolder:ViewModel() {
    private lateinit var id:String

    fun setSelectedId(selectedId:String){
        id = selectedId
    }

    fun getTvShow(): TvShow {
        lateinit var selectedTvShow: TvShow
        val tvShows = DummyData.generateDummyTVShows()
        for (tvShow in tvShows) {
            if (tvShow.id == id) {
                selectedTvShow = tvShow
            }
        }
        return selectedTvShow
    }
}