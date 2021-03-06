package com.peoplellink.instvcsample

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private val PERMISSION_CODE = 100
    private lateinit var meetingId: AppCompatEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        meetingId = findViewById(R.id.meetingId)
        val connectBtn: Button = findViewById(R.id.connectBtn)
        connectBtn.setOnClickListener(this)
        requestPermission()
    }


    private fun requestPermission() {
        val permissions = arrayOf(
            Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO
        )
        for (permission in permissions) {
            if (ContextCompat.checkSelfPermission(
                    this@LoginActivity, permission
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@LoginActivity, permissions, PERMISSION_CODE
                )
                return
            }
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_CODE && grantResults.size == 2 && grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {

        }
    }

    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.connectBtn -> {
                if (meetingId.text.toString().isEmpty()) {
                    Toast.makeText(this, "Please enter id", Toast.LENGTH_SHORT).show()
                    return
                }

                startActivity(
                    Intent(this@LoginActivity, RemoteIdActivity::class.java)
                        .putExtra("meetingId", meetingId.text.toString())
                )
            }
        }
    }
}