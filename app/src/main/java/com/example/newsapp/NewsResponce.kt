package com.example.newsapp

data class NewsResponce(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)