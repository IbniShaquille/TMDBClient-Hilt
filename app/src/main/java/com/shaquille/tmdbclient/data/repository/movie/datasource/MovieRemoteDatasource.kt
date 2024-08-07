package com.shaquille.tmdbclient.data.repository.movie.datasource

import com.shaquille.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}