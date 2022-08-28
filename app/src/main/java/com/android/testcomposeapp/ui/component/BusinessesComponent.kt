package com.android.testcomposeapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.android.mujaz.ui.theme.colors.mujazColor
import com.android.testcomposeapp.data.datasource.api.model.Businesses
import com.android.testcomposeapp.ui.theme.styles.textStyleBold14
import com.android.testcomposeapp.ui.theme.styles.textStyleRegular12

@Composable
fun BusinessesComponent(businesses: Businesses) {
    Card(modifier = Modifier.padding(20.dp), elevation = 10.dp, shape = RoundedCornerShape(10.dp)) {
        Column(modifier = Modifier.background(MaterialTheme.mujazColor.backgroundColor2)) {
            ImageComponent(
                businesses.imageUrl ?: "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = businesses.name ?: "",
                    style = textStyleBold14(),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f)
                )
                Text(text = businesses.rating.toString(), style = textStyleRegular12())
            }

            LazyRow(modifier = Modifier.padding(10.dp), content = {
                item {
                    RoundedBackgroundComponent(
                        businesses.isClosed(),
                        if (businesses.isClosed == true) MaterialTheme.mujazColor.buttonColor3 else MaterialTheme.mujazColor.topSecretTextColor,
                        textColor = MaterialTheme.mujazColor.backgroundColor1
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                }
                items(businesses.categories) {
                    it.title?.let { it1 ->
                        RoundedBackgroundComponent(it1, MaterialTheme.mujazColor.categoryBackground)
                        Spacer(modifier = Modifier.width(5.dp))
                    }
                }
            })
        }
    }
}
