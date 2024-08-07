package com.shaquille.tmdbclient.presentation.di.artist

import com.shaquille.tmdbclient.domain.usecase.GetArtistsUseCase
import com.shaquille.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.shaquille.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}