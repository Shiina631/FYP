package com.example.prototype2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.loginBtn
import kotlinx.android.synthetic.main.activity_main.registerBtn
import kotlinx.android.synthetic.main.activity_register.*

class registerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val gender = resources.getStringArray(R.array.gender)

        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, gender)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@registerActivity,
                        getString(R.string.selected_item) + " " +
                                "" + gender[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        backBtn2.setOnClickListener{
            finish()
        }

        loginBtn.setOnClickListener{
            val intent = Intent(this,loginActivity::class.java)
            startActivity(intent)
        }

        registerBtn.setOnClickListener{
            val intent = Intent(this,loginActivity::class.java)
            startActivity(intent)
        }
    }
}
