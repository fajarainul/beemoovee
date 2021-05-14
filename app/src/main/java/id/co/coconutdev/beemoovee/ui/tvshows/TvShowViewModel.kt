package id.co.coconutdev.beemoovee.ui.tvshows

import androidx.lifecycle.ViewModel
import id.co.coconutdev.beemoovee.data.TvShow
import id.co.coconutdev.beemoovee.utils.DummyData

class TvShowViewModel:ViewModel() {
    fun getTvShows():List<TvShow> = DummyData.generateDummyTVShows()

}