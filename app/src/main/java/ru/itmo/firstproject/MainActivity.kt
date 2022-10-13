package ru.itmo.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val button: Button = findViewById(R.id.button)
           button.setOnClickListener() {
             openSecondActivity()

        }
    }
    private fun openSecondActivity() {
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }

}
