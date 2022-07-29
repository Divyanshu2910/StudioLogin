package com.Studio.Studiologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Intent
public class MainActivity : AppCompatActivity() {
    lateinit var etEmail:EditText
    lateinit var etPassword :EditText
    lateinit var tvforgotpassword: TextView
    lateinit var btnLogin: Button
    lateinit var tvSignup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        tvforgotpassword=findViewById(R.id.tvforgotpassword)
        btnLogin=findViewById(R.id.btnLogin)
        tvSignup=findViewById(R.id.tvSignup)

        tvforgotpassword.setOnClickListener {
            var intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
            finish()
        }
        tvSignup.setOnClickListener {
            var intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnLogin.setOnClickListener{
            System.out.println("clicked")
            var email = etEmail.text.toString()
            var password = etPassword.text.toString()
            System.out.println("email $email")
            if (email.isNullOrEmpty())
            {
                etEmail.error = resources.getString(R.string.please_enter_email)
                etEmail.requestFocus()
            }
            else if (password.isNullOrEmpty())
            {
                etPassword.error = resources.getString(R.string.please_enter_Password)
                etPassword.requestFocus()
            }
            else {
                Toast.makeText(
                    this,
                    resources.getString(R.string.login_successfully),
                    Toast.LENGTH_SHORT
                ).show()
            }

        }

        }

    }
