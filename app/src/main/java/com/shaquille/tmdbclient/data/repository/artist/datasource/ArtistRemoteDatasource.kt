package com.shaquille.tmdbclient.data.repository.artist.datasource

import com.shaquille.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}