package org.example.fiorry_kobweb.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.background
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

val MainButtonStyle = CssStyle {
    base { Modifier.width(80.percent).maxWidth(600.px) }
}
@Composable
fun MainButton(
    title: String,
    marginTop: CSSLengthOrPercentageNumericValue = 42.px,
    onClick: () -> Unit,
) {
    Box(
        modifier = MainButtonStyle.toModifier()
            .margin(top = marginTop, bottom = 20.px)
            .height(54.px)
            .styleModifier {
                background("linear-gradient(90deg, #CA46CD, #A06EFC)")
            }
            .borderRadius(27.px)
            .onClick { onClick.invoke() },
        contentAlignment = Alignment.Center
    ) {
        P(
            Modifier
                .color(Colors.White)
                .fontWeight(FontWeight.Bold)
                .fontSize(18.px)
                .textAlign(TextAlign.Center)
                .toAttrs()
        ) {
            Text(title)
        }
    }
}