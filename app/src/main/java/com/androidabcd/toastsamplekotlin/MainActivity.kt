package com.androidabcd.toastsamplekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Default Toast
        val btnDefaultToast = findViewById<Button>(R.id.btn_toast_default)
        btnDefaultToast.setOnClickListener(View.OnClickListener {
            val text = "This is default toast!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        })

        // Top left Toast
        val btnTopLeftToast = findViewById<Button>(R.id.btn_toast_topLeft)
        btnTopLeftToast.setOnClickListener(View.OnClickListener {
            val text = "This toast is on top left!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.TOP or Gravity.LEFT, 0, 0)
            toast.show()

        })

        /*// Custom Toast
        val btnCustomToast = findViewById<Button>(R.id.btn_toast_custom)
        btnCustomToast.setOnClickListener(View.OnClickListener {
            val inflater = layoutInflater
            val container: ViewGroup = findViewById(R.id.custom_toast_container)
            val layout: ViewGroup = inflater.inflate(R.layout.custom_toast, container)
            val text: TextView = layout.findViewById(R.id.text)
            text.text = "This is a custom toast"
            with (Toast(applicationContext)) {
                setGravity(Gravity.CENTER_VERTICAL, 0, 0)
                duration = Toast.LENGTH_LONG
                view = layout
                show()
            }

        })*/
    }
}
