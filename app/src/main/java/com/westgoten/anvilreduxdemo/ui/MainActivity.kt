package com.westgoten.anvilreduxdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.westgoten.anvilreduxdemo.Store
import com.westgoten.anvilreduxdemo.ui.views.CounterView

class MainActivity : AppCompatActivity() {
    val store = Store.redukt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(CounterView(this))
    }
}
