package org.example.fiorry_kobweb.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.flexGrow
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.toModifier
import org.example.fiorry_kobweb.utils.Theme
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text


val QuestionsCounterStyle = CssStyle {
    base {
        Modifier
            .styleModifier {
                property("width", "calc(100% - 36px)")
                property("margin", "10px 18px 0px 18px")//топ право низ лево

            }
    }
    /*Breakpoint.SM {
        Modifier
            .styleModifier {
                property("width", "calc(80% - 40px)")
                property("margin", "20px 20px 0px 20px")//топ право низ лево

            }
    }
    Breakpoint.MD {
        Modifier
            .styleModifier {
                property("width", "calc(60% - 40px)")
                property("margin", "20px 20px 0px 20px")//топ право низ лево

            }
    }*/
}
@Composable
fun QuestionsCounterSection(
    currentQuestion: Int
) {
    val questionSize = 14
    Column(
        modifier = QuestionsCounterStyle.toModifier().maxWidth(900.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
        ) {
            P(
                attrs = Modifier.fontSize(14.px).fontWeight(FontWeight.Normal)
                    .align(Alignment.Center)
                    .color(Theme.CounterTitleColor.rgb).toAttrs()
            ) {
                Text("Fulfil your sex desires")
            }
            P(
                attrs = Modifier.fontSize(14.px).fontWeight(FontWeight.Normal)
                    .align(Alignment.CenterEnd)
                    .color(Theme.CounterTitleColor.rgb).toAttrs()
            ) {
                Text("$currentQuestion/$questionSize")
            }
        }

        Div(
            Modifier
                .fillMaxWidth()
                .display(DisplayStyle.Flex)
                .justifyContent(JustifyContent.Center)
                .gap(8.px)// отступ между элементами
                .toAttrs()
        ) {
            repeat(questionSize) { index ->
                Div(
                    Modifier
                        .flexGrow(1.0)
                        .height(4.px)
                        .backgroundColor(
                            if (index < currentQuestion) Theme.MainAppColor.rgb else Theme.CounterItemColor.rgb
                        )
                        .borderRadius(2.px).toAttrs()
                )
            }
        }
    }
}