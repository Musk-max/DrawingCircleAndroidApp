package com.example.drawingcircle

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color.RED
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class DrawingCircle(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
     val mainPaint:Paint
    init {
        mainPaint=Paint()
        mainPaint.color=RED
   }

    var xpos=0f
    var ypos=0f

    override fun onDraw(canvas: Canvas) {
        canvas.drawCircle(xpos,ypos,100f,mainPaint)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event!!.action==MotionEvent.ACTION_DOWN){
            xpos= event!!.x
            ypos= event.y
            invalidate()
            return true
        }
        else if (event!!.action==MotionEvent.ACTION_MOVE){
            xpos= event!!.x
            ypos= event.y
            invalidate()
            return true
        }
        else{return false}

    }
}