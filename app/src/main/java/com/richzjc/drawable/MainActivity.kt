package com.richzjc.drawable

import android.graphics.drawable.LevelListDrawable
import android.graphics.drawable.TransitionDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private val bg by lazy { findViewById<View>(R.id.bg) }

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
        bg.background = ContextCompat.getDrawable(this, R.drawable.inset_drawable)
    }

    private fun setTransitionDrawable() {
        val drawable = ContextCompat.getDrawable(this, R.drawable.transition_drawable) as? TransitionDrawable
        bg.background = drawable
        drawable?.startTransition(4000)
    }

    private fun setLevelListDrawable() {
       val drawalbe = ContextCompat.getDrawable(this, R.drawable.level_drawalbe) as? LevelListDrawable
        bg.background = drawalbe
        drawalbe?.level = 3
    }

    private fun setStateListDrawable() {
        bg.background = ContextCompat.getDrawable(this, R.drawable.state_list_drawable)
        bg.isSelected = !bg.isSelected
    }

    private fun setLayerDrawable() {
        bg.background = ContextCompat.getDrawable(this, R.drawable.layer_drawable)
    }

    private fun setShapeDrawable() {
        bg.background = ContextCompat.getDrawable(this, R.drawable.shape_drawable)
    }

    private fun setBitmapDrawable() {
        bg.background = ContextCompat.getDrawable(this, R.drawable.bitmap_drawable)
    }
}
