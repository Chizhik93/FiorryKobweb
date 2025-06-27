package org.example.fiorry_kobweb.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun TabBar() {
    Box(
        modifier = Modifier
            .styleModifier {
                property("width", "calc(100% - 36px)")
                property("margin", "8px 18px 0px 18px")
            }
            .height(56.px)
            .background(Color.rgb(243, 243, 243))
            .borderRadius(8.px)
    ) {
        Image(
            src = "logo.png",
            modifier = Modifier.margin(topBottom = 12.px).height(32.px).align(Alignment.Center)
        )
    }
}