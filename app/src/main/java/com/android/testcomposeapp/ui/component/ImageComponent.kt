package com.android.testcomposeapp.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun ImageComponent(
    imageUrl: String,
    modifier: Modifier
) {
    GlideImage(
        imageModel = imageUrl,
        modifier = modifier,
        // shows an indicator while loading an image.
        loading = {
            Box(modifier = Modifier.matchParentSize()) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        },
        // shows an error text if fail to load an image.
        failure = {
            Text(text = "image request failed.")
        }
    )
}
