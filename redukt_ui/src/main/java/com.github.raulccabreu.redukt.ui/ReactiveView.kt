package com.github.raulccabreu.redukt.ui

import android.content.Context
import com.github.raulccabreu.redukt.Redukt
import com.github.raulccabreu.redukt.states.StateListener
import trikita.anvil.RenderableView

abstract class ReactiveView<T>(context: Context) : RenderableView(context), StateListener<T> {

    private var isRegistered = false

    protected abstract fun getRedukt(): Redukt<T>

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        registerStateListener()
    }

    override fun onDetachedFromWindow() {
        unregisterStateListener()
        super.onDetachedFromWindow()
    }

    private fun registerStateListener() {
        if (isRegistered) return

        isRegistered = true
        getRedukt().listeners.add(this)
        onChanged(getRedukt().state)
    }

    private fun unregisterStateListener() {
        getRedukt().listeners.remove(this)
        isRegistered = false
    }

    override fun hasChanged(newState: T, oldState: T): Boolean = newState != oldState

}