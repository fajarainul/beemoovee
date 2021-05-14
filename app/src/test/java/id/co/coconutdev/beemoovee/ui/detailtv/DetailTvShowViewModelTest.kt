package id.co.coconutdev.beemoovee.ui.detailtv

import id.co.coconutdev.beemoovee.utils.DummyData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyTvShow = DummyData.generateDummyTVShows()[0];
    private val tvShowId = dummyTvShow.id;

    @Before
    fun setUp(){
        viewModel = DetailTvShowViewModel()
        viewModel.setSelectedId(tvShowId)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedId(dummyTvShow.id)
        val tvShow = viewModel.getTvShow()
        assertNotNull(tvShow)
        assertEquals(dummyTvShow.id, tvShow.id)
        assertEquals(dummyTvShow.title, tvShow.title)
        assertEquals(dummyTvShow.description, tvShow.description)
        assertEquals(dummyTvShow.imageUrl, tvShow.imageUrl)
        assertEquals(dummyTvShow.releaseDate, tvShow.releaseDate)
        assertEquals(dummyTvShow.rating, tvShow.rating, 0.0)
    }
}