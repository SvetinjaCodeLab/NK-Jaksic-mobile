package presentation.screens.news.articles

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import data.remote.api.NKJaksicApi
import data.remote.dataSource.RemoteDataSourceImpl
import data.repository.ArticleRepositoryImpl
import domain.usecase.GetAllArticlesUseCase

class News : Screen {
    @Composable
    override fun Content() {
        NewsScreen(
            viewModel = NewsScreenViewModel(
                getAllArticlesUseCase = GetAllArticlesUseCase(
                    articleRepository = ArticleRepositoryImpl(
                        remoteDataSource = RemoteDataSourceImpl(
                            nkJaksicApi = NKJaksicApi()
                        )
                    )
                )
            )
        )
    }
}