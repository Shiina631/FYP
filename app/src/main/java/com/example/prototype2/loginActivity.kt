package com.example.prototype2

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.registerBtn

class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        backBtn.setOnClickListener{
            finish()
        }

        registerBtn.setOnClickListener{
            val intent = Intent(this,registerActivity::class.java)
            startActivity(intent)

        }

        loginAccBtn.setOnClickListener{
            val intent = Intent(this,fullSurveyActivity::class.java)
            startActivity(intent)

        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
