package data.model

import kotlinx.serialization.Serializable

@Serializable
data class Article(
    val articleId: Long? = null,
    val title: String? = null,
    val summary: String? = null,
    val content: String? = null,
    val author: String? = null,
    val publishedDate: String? = null,
    val lastUpdated: String? = null,
    val weather: String? = null,
    val photoUrl: String? = null,
)
