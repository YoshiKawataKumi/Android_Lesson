package com.example.android.sample.sharedpreference

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // MARK: fields
        // SharedPreference
        val pref = getSharedPreferences("file_name", Context.MODE_PRIVATE)
        // UI
        val editText = this.findViewById<EditText>(R.id.editText)
        val button = this.findViewById<Button>(R.id.store)

        // MARK: set values
        // SharedPreference
        val storedText = pref.getString("key", "未登録")
        // UI
        editText.setText(storedText)

        // MARK: methods
        // tapActions
        button.setOnClickListener {
            val inputText = editText.text.toString()
            pref.edit().putString("key", inputText).apply()
        }

    }
}
