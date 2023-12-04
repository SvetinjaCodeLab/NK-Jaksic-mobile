package presentation.screens.news.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import data.model.Article
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun ArticleCard(
    article: Article,
    onItemClick: (article: Article) -> Unit
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onItemClick.invoke(article) }
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            article.photoUrl?.let {
                KamelImage(
                    asyncPainterResource(it),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
            }
            Divider(
                modifier = Modifier.padding(horizontal = 16.dp),
                color = Color.LightGray,
                thickness = 1.dp
            )
            Column {
                if (article.title != null) Text(article.title)
                if (article.author != null) Text(article.author)
                if (article.weather != null) Text(article.weather)
            }
        }
    }
}