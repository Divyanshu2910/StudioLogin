package com.Studio.Studiologin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doOnTextChanged

 public class ForgotPasswordActivity : AppCompatActivity() {
     lateinit var etEmail: EditText
     lateinit var etPhone: EditText
     lateinit var btnNext: Button
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.forgot_password_main)
         etEmail = findViewById(R.id.etEmail)
         etPhone = findViewById(R.id.etPhone)
         btnNext = findViewById(R.id.btnNext)
         btnNext.setOnClickListener {
             System.out.println("clicked")
             var email = etEmail.text.toString()
             var Phone = etPhone.text.toString()
             if (email.isNullOrEmpty()) {
                 etEmail.error = resources.getString(R.string.please_enter_email)
                 etEmail.requestFocus()
             }
             else if (Phone.isNullOrEmpty()){
                 etPhone.error = "Please Enter Phone Number"
                 etPhone.requestFocus()
             }
             btnNext.setOnClickListener {
                 var intent = Intent(this, otpActivity::class.java)
                 startActivity(intent)
                 finish()}
         }
     }
 }