package org.example.fiorry_kobweb.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.aspectRatio
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.example.fiorry_kobweb.components.sections.PageTitle
import org.example.fiorry_kobweb.components.sections.QuestionsCounterSection
import org.example.fiorry_kobweb.components.sections.TabBar
import org.example.fiorry_kobweb.components.widgets.MainButton
import org.example.fiorry_kobweb.utils.Theme
import org.example.fiorry_kobweb.utils.gendersList
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text


@Composable
fun GendersLayout(myGender: Boolean, pageTitle: String, nextPage: () -> Unit) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TabBar()
            QuestionsCounterSection(if (myGender) 1 else 2)
            PageTitle(pageTitle)

            GenderGridLayout(myGender)

            MainButton("Continue") { nextPage.invoke() }
        }
    }
}

@Composable
fun GenderGridLayout(myGender: Boolean) {
    var selected by remember { mutableStateOf<String?>(null) }
    val selectedList = remember { mutableStateListOf<String>() }
    SimpleGrid(
        numColumns = numColumns(base = 2, sm = 2, md = 3),
        modifier = Modifier.width(80.percent).maxWidth(900.px).margin(topBottom = 20.px)
    ) {
        gendersList.forEach { gender ->
            val isSelected = if (myGender) {
                selected == gender
            } else {
                selectedList.contains(gender)
            }
            GenderItem(gender, selected = isSelected) {
                if (myGender) {
                    selected = if (isSelected) null else it
                } else {
                    if (isSelected) {
                        selectedList.remove(it)
                    } else {
                        selectedList.add(it)
                    }
                }
            }
        }
    }
}

@Composable
private fun GenderItem(
    title: String,
    selected: Boolean,
    onClick: (String) -> Unit,
) {
    val borderColor = if (selected) Theme.MainAppColor.rgb else Theme.BoxHintColor.rgb
    val titleColor = if (selected) Theme.MainAppColor.rgb else Color.black
    Box(
        modifier = Modifier
            .padding(all = 8.px)
            .margin(all = 8.px)
            .aspectRatio(1.2 / 1)
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = borderColor
            )
            .borderRadius(8.px)
            .onClick { onClick.invoke(title) },
        contentAlignment = Alignment.Center
    ) {
        P(
            attrs = Modifier
                .fontSize(18.px)
                .fontWeight(FontWeight.Bold)
                .color(titleColor)
                .toAttrs()
        ) {
            Text(title)
        }
    }
}