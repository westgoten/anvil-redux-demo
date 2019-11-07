package com.westgoten.anvilreduxdemo.reducers

import com.github.raulccabreu.redukt.actions.Action
import com.github.raulccabreu.redukt.reducers.Reducer
import com.westgoten.anvilreduxdemo.actions.CounterActionCreator
import com.westgoten.anvilreduxdemo.models.AppState

class AppStateReducer : Reducer<AppState> {
    companion object {
        const val NAME = "appStateReducer"
    }

    override fun reduce(state: AppState, action: Action<*>): AppState {
        return when (action.name) {
            CounterActionCreator.INCREMENT -> AppState(state.count + 1)
            CounterActionCreator.DECREMENT -> AppState(state.count - 1)
            else -> state
        }
    }
}