package org.example.fiorry_kobweb.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.margin
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import org.example.fiorry_kobweb.components.sections.PageText
import org.example.fiorry_kobweb.components.sections.PageTitle
import org.example.fiorry_kobweb.components.sections.TabBar
import org.example.fiorry_kobweb.components.widgets.MainButton
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    val nav = rememberPageContext()
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TabBar()
            Image(
                src = "ic_start_image.png",
                modifier = Modifier.width(60.percent).maxWidth(500.px).margin(top = 20.px)
            )
            PageTitle("Find your transgender date today")
            PageText("Our community count 35,000+ transgender people. Only verified profiles and 100% private connections")
            MainButton("Get started"){ nav.router.navigateTo("/myGender") }
        }
    }
}
