package com.example.android.sample.rssreader

import java.util.*

data class Article(val title: String, val link: String, val pubDate: Date) {

    data class Rss(val title: String,
        val pubDate: Date, val articles: List<Article>)
}