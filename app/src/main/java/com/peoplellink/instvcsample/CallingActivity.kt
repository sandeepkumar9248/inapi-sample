package com.peoplellink.instvcsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class CallingActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calling)


        val answerBtn: Button = findViewById(R.id.answerBtn)
        val declineBtn: Button = findViewById(R.id.declineBtn)
        val endCallBtn: Button = findViewById(R.id.endCallBtn)
        answerBtn.setOnClickListener(this)
        declineBtn.setOnClickListener(this)
        endCallBtn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.answerBtn -> {
                // do some work here
            }
            R.id.declineBtn -> {
                // do some work here
            }
            R.id.endCallBtn -> {
                // do some work here
            }
        }


    }
}