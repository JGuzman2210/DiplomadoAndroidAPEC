package com.android.softhk.loginskype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        button.setOnClickListener{

            val _intent:Intent = Intent(this,PasswordActivity::class.java)
            var username:String = editText.text.toString()
            _intent.putExtra(KEY_USER,username)
            startActivity(_intent)
        }
    }
}
