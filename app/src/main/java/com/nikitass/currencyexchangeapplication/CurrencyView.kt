package com.nikitass.currencyexchangeapplication

import android.content.Context
import com.nikitass.currencyexchangeapplication.model.Currency

interface CurrencyView {
    fun setLoading(loading : Boolean)
    fun fillRatesData(rates : List<Currency>)
    fun getContext() : Context
}