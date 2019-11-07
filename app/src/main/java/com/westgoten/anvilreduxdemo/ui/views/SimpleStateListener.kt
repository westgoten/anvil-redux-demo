package com.westgoten.anvilreduxdemo.ui.views

interface SimpleStateListener<T> {
    fun onChanged(state: T)
}