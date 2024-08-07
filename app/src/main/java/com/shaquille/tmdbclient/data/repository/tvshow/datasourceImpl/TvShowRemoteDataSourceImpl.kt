package com.shaquille.tmdbclient.data.repository.tvshow.datasourceImpl

import com.shaquille.tmdbclient.data.api.TMDBService
import com.shaquille.tmdbclient.data.model.tvshow.TvShowList
import com.shaquille.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

