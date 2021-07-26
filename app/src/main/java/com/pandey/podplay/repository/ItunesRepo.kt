package com.pandey.podplay.repository

import com.pandey.podplay.service.ItunesService


class ItunesRepo(private val itunesService: ItunesService) {
    suspend fun searchByTerm(term: String) =
        itunesService.searchPodcastByTerm(term)
}