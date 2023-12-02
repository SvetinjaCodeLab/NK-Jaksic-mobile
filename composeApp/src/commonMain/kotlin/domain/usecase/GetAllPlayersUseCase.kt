package domain.usecase

import domain.repository.TeamRepository

class GetAllPlayersUseCase(private val teamRepository: TeamRepository) {
    suspend operator fun invoke() = teamRepository.getAllPlayers()
}