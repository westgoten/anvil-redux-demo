package com.westgoten.anvilreduxdemo

import com.github.raulccabreu.redukt.Redukt
import com.westgoten.anvilreduxdemo.models.AppState
import com.westgoten.anvilreduxdemo.reducers.AppStateReducer

object Store {
    val redukt = Redukt(AppState())

    init {
        redukt.reducers[AppStateReducer.NAME] = AppStateReducer()
    }
}

fun getStore() = Store.redukt