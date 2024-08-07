package com.shaquille.tmdbclient.presentation.di.movie

import com.shaquille.tmdbclient.domain.usecase.GetMoviesUseCase
import com.shaquille.tmdbclient.domain.usecase.UpdateMoviesUsecase
import com.shaquille.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}