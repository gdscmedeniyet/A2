package com.example.demo

import android.app.ApplicationErrorReport
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun tf(view:View){
        var intent = Intent(applicationContext,MainActivity2::class.java)
        startActivity(intent)
    }
    fun android(view: View){
        var intent = Intent(applicationContext,
            AndroidInfo::class.java)
        startActivity(intent)

    }
    fun flutter(view:View){
        var intent = Intent(applicationContext,FlutterInfo::class.java)
        startActivity(intent)

    }
    fun firebase(view: View){
        var intent = Intent(applicationContext,FirebaseInfo::class.java)
        startActivity(intent)

    }
    fun cloud(view: View){
        var intent = Intent(applicationContext,CloudInfo::class.java)
        startActivity(intent)

    }
}