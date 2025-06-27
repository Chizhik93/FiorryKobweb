package org.example.fiorry_kobweb.utils

enum class StringRes (
    val en: String = "",
    val ar: String = "",
) {
    GenderTransW("Trans woman"),
    GenderTransM("Trans man"),
    GenderCross("Crossdresser"),
    GenderNonBin("Non-binary"),
    GenderQueer("Queer"),
    GenderCisW("Сis woman"),
    GenderCisM("Сis man"),
}

val gendersList = listOf(
    "Trans woman",
    "Trans man",
    "Crossdresser",
    "Non-binary",
    "Queer",
    "Сis woman",
    "Сis man",
)