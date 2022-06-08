package com.peoplellink.instvcsample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import org.webrtc.SurfaceViewRenderer

class InApiVcActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in_api_vc)

        val mLocalSurfaceView = findViewById<SurfaceViewRenderer>(R.id.LocalSurfaceView)
        val mRemoteSurfaceView = findViewById<SurfaceViewRenderer>(R.id.RemoteSurfaceView)

        val endCall = findViewById<AppCompatButton>(R.id.endCall)
        val switchCamera = findViewById<AppCompatButton>(R.id.switchCamera)
        val muteVideo = findViewById<AppCompatButton>(R.id.muteVideo)
        val muteAudio = findViewById<AppCompatButton>(R.id.muteAudio)
        endCall.setOnClickListener(this)
        switchCamera.setOnClickListener(this)
        muteVideo.setOnClickListener(this)
        muteAudio.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.muteAudio -> {
                // do some work here
            }
            R.id.muteVideo -> {
                // do some work here
            }
            R.id.switchCamera -> {
                // do some work here
            }
            R.id.endCall -> {
                // do some work here
            }
        }
    }
}