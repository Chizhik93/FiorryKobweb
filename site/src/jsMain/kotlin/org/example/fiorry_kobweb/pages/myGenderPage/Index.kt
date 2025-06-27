package org.example.fiorry_kobweb.pages.myGenderPage

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

@Page("/myGender")
@Composable
fun MyGenderPage(){
    val nav = rememberPageContext()
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TabBar()
            QuestionsCounterSection(1 )
            PageTitle("What is your gender?")

            GenderGridLayout(true)

            MainButton("Continue") { nav.router.navigateTo("/interestedIn") }
        }
    }
}