package com.app.profilescr

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var faceAction: ImageView
    lateinit var gitAction: ImageView
    lateinit var linkedAction: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        faceAction= findViewById(R.id.fac)
        gitAction=findViewById(R.id.hub)
        linkedAction=findViewById(R.id.linked)

        faceAction.setOnClickListener {
        val faceIntent= Intent(Intent.ACTION_VIEW)
            faceIntent.data= Uri.parse("https://www.facebook.com/asmaameligy2/")
            startActivity(faceIntent)
        }

        gitAction.setOnClickListener {
            val gitIntent= Intent(Intent.ACTION_VIEW)
            gitIntent.data= Uri.parse("https://github.com/asmaameligy")
            startActivity(gitIntent)
        }

        linkedAction.setOnClickListener {
            val linkedIntent= Intent(Intent.ACTION_VIEW)
            linkedIntent.data= Uri.parse("https://www.linkedin.com/in/asmaameligy/")
            startActivity(linkedIntent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}