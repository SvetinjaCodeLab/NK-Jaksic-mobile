package domain.usecase

import domain.repository.TeamRepository

class GetAllArticlesUseCase(private val teamRepository: TeamRepository) {
    suspend operator fun invoke() = teamRepository.getAllArticles()
}