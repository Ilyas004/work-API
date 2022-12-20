package com.example.mars.model.beznal

object BezNalOverflow {
    private val beznal1 = BeznalItem(name = "USD", rateBuy = 24.3, rateSell = 25.1)
    private val beznal2 = BeznalItem(name = "RUB", rateBuy = 33.2, rateSell = 32.5)
    private val beznal3 = BeznalItem(name = "EUR", rateBuy = 55.3, rateSell = 65.1)
    private val beznal4 = BeznalItem(name = "UEN", rateBuy = 11.3, rateSell = 10.1)

    val listBeznalItem = arrayListOf<BeznalItem>(
        beznal1,
        beznal2,
        beznal3,
        beznal4
    )
}