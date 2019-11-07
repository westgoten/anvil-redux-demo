package com.westgoten.anvilreduxdemo.actions

import com.github.raulccabreu.redukt.actions.Action
import com.westgoten.anvilreduxdemo.getStore
import com.westgoten.anvilreduxdemo.models.AppState

class CounterActionCreator {
    companion object {
        const val INCREMENT = "INC"
        const val DECREMENT = "DEC"

        fun increment() = getStore().dispatch(Action<AppState>(INCREMENT), false)

        fun decrement() = getStore().dispatch(Action<AppState>(DECREMENT), false)
    }
}