package com.shaquille.tmdbclient.domain.usecase

import com.shaquille.tmdbclient.data.model.tvshow.TvShow
import com.shaquille.tmdbclient.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()
}