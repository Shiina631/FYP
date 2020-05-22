package com.example.prototype2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_full_survey.*
import kotlinx.android.synthetic.main.activity_main.*

class fullSurveyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_survey)

        backBtn6.setOnClickListener{
            finish()
        }

        userMainPageBtn.setOnClickListener{
            val intent = Intent(this,MainPageActivity::class.java)
            startActivity(intent)

        }

    }
}
