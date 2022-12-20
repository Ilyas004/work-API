package com.example.mars.model.nal

data class NalichkaItem(
    val currencyCodeA: Int,
    val currencyCodeB: Int,
    val date: Int,
    val rateBuy: Double,
    val rateSell: Double
)