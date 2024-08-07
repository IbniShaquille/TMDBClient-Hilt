package com.shaquille.tmdbclient.domain.usecase

import com.shaquille.tmdbclient.data.model.movie.Movie
import com.shaquille.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
  suspend fun execute():List<Movie>? = movieRepository.getMovies()
}