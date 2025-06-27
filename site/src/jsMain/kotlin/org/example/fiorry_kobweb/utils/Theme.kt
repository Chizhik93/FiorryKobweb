package org.example.fiorry_kobweb.utils

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Theme(
    val hex: String,
    val rgb: CSSColorValue
){
    MainAppColor(hex = "#BE69FF", rgb = rgb(r = 190, g = 105, b = 255)),
    BoxHintColor(hex = "#CACACA", rgb = rgb(r = 202, g = 202, b = 202)),
    CounterTitleColor(hex = "#19181D", rgb = rgb(r = 25, g = 24, b = 29)),
    CounterItemColor(hex = "#F3F3F3", rgb = rgb(r = 243, g = 243, b = 243)),
}