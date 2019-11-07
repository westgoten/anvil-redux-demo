package com.westgoten.anvilreduxdemo.ui.views

import android.content.Context
import android.widget.LinearLayout
import android.graphics.Color
import com.github.raulccabreu.redukt.Redukt
import com.github.raulccabreu.redukt.ui.ReactiveView
import com.westgoten.anvilreduxdemo.Store
import com.westgoten.anvilreduxdemo.models.AppState

import trikita.anvil.DSL.*

class CounterView(context: Context) : ReactiveView<AppState>(context) {
    private var count = 0

    override fun view() {
        linearLayout {
            size(MATCH, MATCH)
            orientation(LinearLayout.VERTICAL)
            padding(dip(8))
            gravity(CENTER)

            button {
                size(WRAP, WRAP)
                text("+")
                margin(0, 0, 0, dip(8))
                onClick {
                    count++ // TODO: Use Action
                }
            }

            textView {
                size(WRAP, WRAP)
                text("$count")
                textColor(Color.BLACK)
                margin(0, 0, 0, dip(8))
            }

            button {
                size(WRAP, WRAP)
                text("-")
                margin(0, 0, 0, dip(8))
                onClick {
                    count-- // TODO: Use Action
                }
            }
        }
    }

    override fun getRedukt(): Redukt<AppState> = Store.redukt

    override fun onChanged(state: AppState) {
        count = state.count
    }
}