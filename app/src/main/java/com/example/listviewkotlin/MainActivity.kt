package com.example.listviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToRecyclerView = findViewById<Button>(R.id.go_to_recyclerview)
        btnToRecyclerView.setOnClickListener{
            val intent = Intent(this@MainActivity, RecyclerActivity::class.java)
            startActivity(intent)
        }

        val language = arrayOf("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")
        val description = arrayOf(
            "C programming is considered as the base for other programming languages",
            "C++ is an object-oriented programming language.",
            "Java is a programming language and a platform.",
            ".NET is a framework which is used to develop software applications.",
            "Kotlin is a open-source programming language, used to develop Android apps and much more.",
            "Ruby is an open-source and fully object-oriented programming language.",
            "Ruby on Rails is a server-side web application development framework written in Ruby language.",
            "Python is interpreted scripting  and object-oriented programming language.",
            "JavaScript is an object-based scripting language.",
            "PHP is an interpreted language, i.e., there is no need for compilation.",
            "AJAX allows you to send and receive data asynchronously without reloading the web page.",
            "Perl is a cross-platform environment used to create network and server-side applications.",
            "Hadoop is an open source framework from Apache written in Java."
        )
        val listView = findViewById<ListView>(R.id.userList)
        listView.adapter = CustomAdapter(this,language,description)

        listView.setOnItemClickListener { adapterView, _, position, _ ->
            val item = adapterView.getItemAtPosition(position)
            val itemId = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this@MainActivity, "item at position $item with id $itemId",Toast.LENGTH_LONG).show()
        }
    }
}