package com.westgoten.anvilreduxdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

import trikita.anvil.DSL.*
import trikita.anvil.RenderableView

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(object : RenderableView(this) {
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
                            count++
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
                            count--
                        }
                    }
                }
            }
        })
    }
}
