package com.example.imadicetask_multiplicationtable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import androidx.activity.enableEdgeToEdge




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val tableNumberEditText = findViewById<EditText>(R.id.tableNumberEditText)

        multiplyButton.setOnClickListener {
// create the explicit intent
            val intent = Intent(this, MultiplicationTable::class.java)
// add the table number to the intent
            intent.putExtra("tableNumber"
                , tableNumberEditText.text.toString())
// start the activity
            startActivity(intent)
        }
    }
}