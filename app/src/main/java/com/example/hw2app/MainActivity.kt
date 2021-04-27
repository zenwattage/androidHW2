 package com.example.hw2app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)


//     fun toast(view: View) {
//         Toast.makeText(this, "Hi there! This is @", Toast.LENGTH_SHORT).show()
//     }

         var usaBtn = findViewById<Button>(R.id.usaBtn)
         var sendBtn = findViewById<Button>(R.id.sendBtn)
         var pacBtn = findViewById<Button>(R.id.pacBtn)
         var earthBtn = findViewById<Button>(R.id.earthBtn)
         var nwBtn = findViewById<Button>(R.id.nwBtn)

         usaBtn.setOnClickListener {
             Toast.makeText(this, "Hi there! This is the ${this.getString(R.string.usaBtn)} Button!", Toast.LENGTH_LONG).show()
         }

         sendBtn.setOnClickListener {
             Toast.makeText(this, "Hi there! This is a ${this.getString(R.string.sendBtn)} Button.!", Toast.LENGTH_LONG).show()
         }

         pacBtn.setOnClickListener {
             // make a toast on button click event
             Toast.makeText(this, "Hi there! This is a ${this.getString(R.string.pacBtn)} Button!", Toast.LENGTH_LONG).show()
         }

         earthBtn.setOnClickListener {
             Toast.makeText(this, "Hi there! This is a ${this.getString(R.string.earthBtn)} Button!", Toast.LENGTH_LONG).show()
         }

         nwBtn.setOnClickListener {
             Toast.makeText(this, "Hi there! This is a ${this.getString(R.string.nwBtn)} Button!", Toast.LENGTH_LONG).show()
         }


     }
 }
