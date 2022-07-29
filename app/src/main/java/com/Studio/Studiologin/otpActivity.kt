package com.Studio.Studiologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class  otpActivity : AppCompatActivity() {
    lateinit var btnVerify: Button
    lateinit var tvResend: TextView
    lateinit var etOtp1: EditText
    lateinit var etOtp2: EditText
    lateinit var etOtp3: EditText
    lateinit var etOtp4: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        etOtp1 = findViewById(R.id.etOtp1)
        etOtp2 = findViewById(R.id.etOtp2)
        etOtp3 = findViewById(R.id.etOtp3)
        etOtp4 = findViewById(R.id.etOtp4)
        btnVerify = findViewById(R.id.btnVerify)
        tvResend = findViewById(R.id.tvResend)
        var otp1 = etOtp1.text.toString()
        var otp2 = etOtp1.text.toString()
        var otp3 = etOtp1.text.toString()
        var otp4 = etOtp1.text.toString()
        if (otp1.isNullOrEmpty()) {
            etOtp1.error = resources.getString(R.string.here)
            etOtp1.requestFocus()
        }
        else if (otp2.isNullOrEmpty()){
            etOtp2.error = resources.getString(R.string.here)
            etOtp2.requestFocus()
        }
        else if (otp3.isNullOrEmpty()) {
            etOtp3.error = resources.getString(R.string.here)
            etOtp3.requestFocus()
        } else if (otp4.isNullOrEmpty()) {
            etOtp4.error = resources.getString(R.string.here)
            etOtp4.requestFocus()
        }
        else
        btnVerify.setOnClickListener{
            Toast.makeText(this,resources.getString(R.string.otp_verify), Toast.LENGTH_LONG).show()

        }

    }
    }