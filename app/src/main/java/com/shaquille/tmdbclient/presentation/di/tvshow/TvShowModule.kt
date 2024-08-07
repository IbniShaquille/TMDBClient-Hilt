package com.shaquille.tmdbclient.presentation.di.tvshow

import com.shaquille.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.shaquille.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.shaquille.tmdbclient.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}