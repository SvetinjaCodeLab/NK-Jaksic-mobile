package domain.repository

import data.model.Article

interface ArticleRepository {
    suspend fun getAllArticles(): List<Article>
}