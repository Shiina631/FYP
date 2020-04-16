package com.example.prototype2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_survey.*

class surveyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey)

        bodyPartSelectBtn.setOnClickListener {
            val intent = Intent(this, bodyPartSelectActivity::class.java)
            startActivity(intent)
        }
    }
}
