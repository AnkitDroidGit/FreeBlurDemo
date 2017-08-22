package com.freeankit.freeblurdemo

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.freeankit.imageview.FreeBlurController

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var layoutBlurred = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.button_layout).setOnClickListener(this)
        findViewById<View>(R.id.button_image).setOnClickListener(this)
        findViewById<View>(R.id.button_i_color).setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.button_layout -> {
                if (layoutBlurred) FreeBlurController.delete(findViewById<View>(R.id.content) as ViewGroup)
                else {
                    val startMs = System.currentTimeMillis()
                    FreeBlurController.with(this@MainActivity)
                            .radius(25)
                            .sampling(2)
                            .async()
                            .animate(500)
                            .onto(findViewById<View>(R.id.content) as ViewGroup)
                }
                layoutBlurred = !layoutBlurred
            }
            R.id.button_image -> {
                FreeBlurController.with(this@MainActivity)
                        .radius(10)
                        .sampling(8)
                        .async()
                        .capture(findViewById<View>(R.id.bottom))
                        .into(findViewById<View>(R.id.bottom) as ImageView)
            }
            R.id.button_i_color -> {
                FreeBlurController.with(this@MainActivity)
                        .radius(25)
                        .sampling(1)
                        .color(Color.argb(66, 0, 255, 255))
                        .async()
                        .capture(findViewById<View>(R.id.top))
                        .into(findViewById<View>(R.id.top) as ImageView)
            }
        }
    }
}
