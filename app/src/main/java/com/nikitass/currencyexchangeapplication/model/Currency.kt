package com.nikitass.currencyexchangeapplication.model

data class Currency(
    val shortForm : String,
    val countryName : String,
    val rate : Double
){
    override fun toString(): String {
        return shortForm
    }
}
