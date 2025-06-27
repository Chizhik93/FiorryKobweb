package org.example.fiorry_kobweb.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun PageTitle(
    title: String,
    marginTop: CSSLengthOrPercentageNumericValue = 20.px
){
    P(
        Modifier.margin(top = marginTop)
            .fillMaxWidth(70.percent)
            .color(Colors.Black )
            .fontWeight(FontWeight.Bold)
            .fontSize(24.px)
            .textAlign(TextAlign.Center)
            .toAttrs()
    ){
        Text(title)
    }
}

@Composable
fun PageText(
    title: String,
    marginTop: CSSLengthOrPercentageNumericValue = 42.px
){
    P(
        Modifier.margin(top = marginTop)
            .fillMaxWidth(80.percent)
            .color(Colors.Gray )
            .fontWeight(FontWeight.Normal)
            .fontSize(16.px)
            .textAlign(TextAlign.Center)
            .toAttrs()
    ){
        Text(title)
    }
}