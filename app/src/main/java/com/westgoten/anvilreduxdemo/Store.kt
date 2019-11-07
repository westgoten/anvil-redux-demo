package com.westgoten.anvilreduxdemo

import com.github.raulccabreu.redukt.Redukt
import com.westgoten.anvilreduxdemo.models.AppState

object Store {
    val redukt = Redukt(AppState())
}