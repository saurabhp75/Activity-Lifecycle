package com.ytlabs.acitivitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate(): ")

        button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart(): ");
    }

    override fun onStart() {
        super.onStart()
        // Refresh screen data(eg. weather) here
        Log.d(TAG, "onStart(): ")
    }

    override fun onResume() {
        super.onResume()
        // un-pause video here
        Log.d(TAG, "onResume(): ")
    }

    override fun onPause() {
        super.onPause()
        // pause video here
        Log.d(TAG, "onPause(): ")
    }

    override fun onStop() {
        super.onStop()
        // logout user here
        Log.d(TAG, "onStop(): ");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy(): ")
    }
}