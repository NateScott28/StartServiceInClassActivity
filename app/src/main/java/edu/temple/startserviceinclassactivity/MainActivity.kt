package edu.temple.startserviceinclassactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val COUNT_DOWN_VALUE = "countDownVal"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countdownValue = findViewById<EditText>(R.id.countdownEditText)

        val countdownStartButton = findViewById<Button>(R.id.countdownButton)

        countdownStartButton.setOnClickListener {
            startService(Intent(this, CountdownService::class.java)
                .putExtra(COUNT_DOWN_VALUE, countdownValue.text.toString().toInt()))
        }

    }
}