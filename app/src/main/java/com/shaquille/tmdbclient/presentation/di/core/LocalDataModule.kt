package com.shaquille.tmdbclient.presentation.di.core

import com.shaquille.tmdbclient.data.db.ArtistDao
import com.shaquille.tmdbclient.data.db.MovieDao
import com.shaquille.tmdbclient.data.db.TvShowDao
import com.shaquille.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.shaquille.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.shaquille.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.shaquille.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.shaquille.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.shaquille.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }


}