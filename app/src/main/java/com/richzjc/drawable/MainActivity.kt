package com.richzjc.drawable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView(){
        findViewById<Button>(R.id.bitmapDrawable).setOnClickListener { setBg(1) }
        findViewById<Button>(R.id.ShapeDrawable).setOnClickListener { setBg(2) }
        findViewById<Button>(R.id.layer_drawable).setOnClickListener { setBg(3)  }
        findViewById<Button>(R.id.statelist_drawable).setOnClickListener { setBg(4)  }
        findViewById<Button>(R.id.levelList_drawable).setOnClickListener { setBg(5)  }
        findViewById<Button>(R.id.transition_drawable).setOnClickListener { setBg(6)  }
        findViewById<Button>(R.id.inset_drawable).setOnClickListener { setBg(7)  }
        findViewById<Button>(R.id.scale_drawable).setOnClickListener { setBg(8)  }
        findViewById<Button>(R.id.clip_drawable).setOnClickListener { setBg(9)  }
    }

    private fun setBg(flag : Int){
        when(flag){
            1 -> {setBitmapDrawable()}
            2 -> {setShapeDrawable()}
            3 -> {setLayerDrawable()}
            4 -> {setStateListDrawable()}
            5 -> {setLevelListDrawable()}
            6 -> {setTransitionDrawable()}
            7 -> {setInsetDrawable()}
            8 -> {setScaleDrawable()}
            9 -> {setClipDrawable()}
        }
    }

    private fun setClipDrawable() {

    }

    private fun setScaleDrawable() {

    }

    private fun setInsetDrawable() {

    }

    private fun setTransitionDrawable() {

    }

    private fun setLevelListDrawable() {

    }

    private fun setStateListDrawable() {

    }

    private fun setLayerDrawable() {

    }

    private fun setShapeDrawable() {

    }

    private fun setBitmapDrawable() {

    }
}
