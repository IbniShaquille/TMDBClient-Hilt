package com.shaquille.tmdbclient.presentation.di.core

import com.shaquille.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.shaquille.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.shaquille.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.shaquille.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import com.shaquille.tmdbclient.data.repository.movie.MovieRepositoryImpl
import com.shaquille.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.shaquille.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.shaquille.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import com.shaquille.tmdbclient.data.repository.tvshow.TvShowRepositoryImpl
import com.shaquille.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.shaquille.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.shaquille.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.shaquille.tmdbclient.domain.repository.ArtistRepository
import com.shaquille.tmdbclient.domain.repository.MovieRepository
import com.shaquille.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}