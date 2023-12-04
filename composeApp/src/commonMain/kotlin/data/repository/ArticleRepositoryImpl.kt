package data.repository

import data.model.Article
import data.remote.dataSource.RemoteDataSource
import domain.repository.ArticleRepository

class ArticleRepositoryImpl(private val remoteDataSource: RemoteDataSource) : ArticleRepository {
    override suspend fun getAllArticles(): List<Article> = remoteDataSource.getAllArticles()
}