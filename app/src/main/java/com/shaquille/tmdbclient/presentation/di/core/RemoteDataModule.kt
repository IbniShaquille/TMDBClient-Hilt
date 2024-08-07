package com.shaquille.tmdbclient.presentation.di.core

import com.shaquille.tmdbclient.BuildConfig
import com.shaquille.tmdbclient.data.api.TMDBService
import com.shaquille.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import com.shaquille.tmdbclient.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.shaquille.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import com.shaquille.tmdbclient.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.shaquille.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.shaquille.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, BuildConfig.API_KEY
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, BuildConfig.API_KEY
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, BuildConfig.API_KEY
        )
    }


}