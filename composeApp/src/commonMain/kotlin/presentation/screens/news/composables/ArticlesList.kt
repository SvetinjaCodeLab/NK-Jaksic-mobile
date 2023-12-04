package presentation.screens.news.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import data.model.Article
import presentation.screens.news.articleDetails.ArticleDetails

@Composable
fun ArticlesList(
    articlesList: List<Article>,
    navigator: Navigator
) {
    LazyColumn {
        items(count = articlesList.size) { index ->
            ArticleCard(
                article = articlesList[index],
                onItemClick = { article ->
                    navigator.push(ArticleDetails(article))
                }
            )
        }
    }
}