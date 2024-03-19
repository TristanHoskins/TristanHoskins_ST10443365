package com.example.imadicetask_multiplicationtable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MultiplicationTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication_table)

// get the table number from the bundle
        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")
// convert the table number to an integer
        val tableNumber = tableString?.toInt()
// display the heading so we can see the value in action
        val multiplicationTable = findViewById<TextView>(R.id.multiplicationTableTextView)
            R.id.multiplicationTableTextView)
        multiplicationTable.text = "$tableNumber x table"
// start with the heading and add two new lines
        var tableDisplay: String = "$tableNumber x table\n\n"
// loop 10 times and keep adding to the string
// set the string onto the display
        multiplicationTable.text = tableDisplay
// declare the control variable
        var counter = 1
        while (counter <= 10) { // check the control variable
            val answer = tableNumber * counter
            tableDisplay += "$tableNumber x $counter = ${answer}\n"
            counter++ //update the control variable
        }
        }
    }
