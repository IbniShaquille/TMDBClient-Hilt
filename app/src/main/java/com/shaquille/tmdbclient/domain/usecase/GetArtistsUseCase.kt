package com.shaquille.tmdbclient.domain.usecase

import com.shaquille.tmdbclient.data.model.artist.Artist
import com.shaquille.tmdbclient.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()

}