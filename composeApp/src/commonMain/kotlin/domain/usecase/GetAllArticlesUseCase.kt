package domain.usecase

import domain.repository.ArticleRepository

class GetAllArticlesUseCase(private val articleRepository: ArticleRepository) {
    suspend operator fun invoke() = articleRepository.getAllArticles()
}