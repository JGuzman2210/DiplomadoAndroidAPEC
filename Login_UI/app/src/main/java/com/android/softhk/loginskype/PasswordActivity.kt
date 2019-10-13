package com.android.softhk.loginskype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_password.*

class PasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
        var hide = supportActionBar?.hide()

        val user:String? = intent.extras.getString(KEY_USER)

        textView2Pass.text = user
    }
}