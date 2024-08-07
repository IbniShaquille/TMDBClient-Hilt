package com.shaquille.tmdbclient.presentation.di

import com.shaquille.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.shaquille.tmdbclient.presentation.di.movie.MovieSubComponent
import com.shaquille.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
   fun createMovieSubComponent():MovieSubComponent
   fun createTvShowSubComponent():TvShowSubComponent
   fun createArtistSubComponent():ArtistSubComponent
}