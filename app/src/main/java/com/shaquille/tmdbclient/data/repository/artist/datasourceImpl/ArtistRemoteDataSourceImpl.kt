package com.shaquille.tmdbclient.data.repository.artist.datasourceImpl

import com.shaquille.tmdbclient.data.api.TMDBService
import com.shaquille.tmdbclient.data.model.artist.ArtistList
import com.shaquille.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

