package com.shaquille.tmdbclient.data.repository.tvshow.datasource

import com.shaquille.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}