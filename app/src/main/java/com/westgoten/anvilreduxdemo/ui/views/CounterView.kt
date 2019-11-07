package com.westgoten.anvilreduxdemo.ui.views

import android.content.Context
import android.widget.LinearLayout
import android.graphics.Color
import com.westgoten.anvilreduxdemo.actions.CounterActionCreator
import com.westgoten.anvilreduxdemo.models.AppState

import trikita.anvil.DSL.*
import trikita.anvil.RenderableView

class CounterView(context: Context) : RenderableView(context), SimpleStateListener<AppState> {
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
                    CounterActionCreator.increment()
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
                    CounterActionCreator.decrement()
                }
            }
        }
    }

    override fun onChanged(state: AppState) {
        count = state.count
    }
}