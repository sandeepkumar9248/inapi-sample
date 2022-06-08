package com.peoplellink.instvcsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.AppCompatEditText

class RemoteIdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remote_id)


        val remoteId: AppCompatEditText = findViewById(R.id.remoteId)
        val startCallBtn: Button = findViewById(R.id.startCallBtn)

        startCallBtn.setOnClickListener {
            startActivity(
                Intent(this@RemoteIdActivity, CallingActivity::class.java)
                .putExtra("meetingId", remoteId.text.toString()))
        }
    }
}