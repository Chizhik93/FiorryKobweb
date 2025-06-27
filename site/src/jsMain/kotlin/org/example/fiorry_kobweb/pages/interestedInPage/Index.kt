package org.example.fiorry_kobweb.pages.interestedInPage

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import org.example.fiorry_kobweb.components.layouts.GenderGridLayout
import org.example.fiorry_kobweb.components.sections.PageTitle
import org.example.fiorry_kobweb.components.sections.QuestionsCounterSection
import org.example.fiorry_kobweb.components.sections.TabBar
import org.example.fiorry_kobweb.components.widgets.MainButton
import org.jetbrains.compose.web.css.px

@Page("/interestedIn")
@Composable
fun InterestedInPage(){
    val nav = rememberPageContext()

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TabBar()
            QuestionsCounterSection(2 )
            PageTitle("Who are you interested in?")

            GenderGridLayout(false)

            MainButton("Continue", marginTop = 0.px) { nav.router.navigateTo("") }
        }
    }
}