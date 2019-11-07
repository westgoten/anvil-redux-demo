package com.westgoten.anvilreduxdemo.ui

import android.os.Bundle
import com.github.raulccabreu.redukt.Redukt
import com.github.raulccabreu.redukt.ui.ReactiveActivity
import com.westgoten.anvilreduxdemo.Store
import com.westgoten.anvilreduxdemo.models.AppState
import com.westgoten.anvilreduxdemo.ui.views.CounterView

class MainActivity : ReactiveActivity<AppState>() {
    private lateinit var counterView: CounterView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        counterView = CounterView(this)
        setContentView(counterView)
    }

    override fun getRedukt(): Redukt<AppState> = Store.redukt

    override fun onChanged(state: AppState) {
        counterView.onChanged(state)
    }
}
