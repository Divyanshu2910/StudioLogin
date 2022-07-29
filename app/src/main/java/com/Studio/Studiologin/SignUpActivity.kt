package com.Studio.Studiologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.widget.doOnTextChanged

 class SignUpActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etEmail: EditText
    lateinit var etPhone: EditText
    private lateinit var etPassword: EditText
    lateinit var etRePassword: EditText
    lateinit var btnRegister: Button
    lateinit var rbtnhe: RadioButton
    lateinit var rbtnshe: RadioButton
    lateinit var rbtnothers: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_activity)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        etRePassword = findViewById(R.id.etRePassword)
        etName = findViewById(R.id.etName)
        etPhone = findViewById(R.id.etPhone)
        rbtnhe = findViewById(R.id.rbtnhe)
        rbtnshe = findViewById(R.id.rbtnshe)
        rbtnothers = findViewById(R.id.rbtnothers)
        etPassword = findViewById(R.id.etPassword)
        btnRegister = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            System.out.println("clicked")
            var name = etName.text.toString()
            var Phone = etPhone.text.toString()
            var email = etEmail.text.toString()
            var password = etPassword.text.toString()
            var repassword =etRePassword.text.toString()
            System.out.println("email $email")

            if (name.isNullOrEmpty()) {
                etName.error = "Please Enter Name"
                etName.requestFocus()
            } else if (email.isNullOrEmpty()) {
                etEmail.error = resources.getString(R.string.please_enter_email)
                etEmail.requestFocus()
            }
            else if (Phone.isNullOrEmpty()) {
                etPhone.error = "Please Enter Phone Number"
                etPhone.requestFocus()
            } else if (password.isNullOrEmpty()) {
                etPassword.error = resources.getString(R.string.please_enter_Password)
                etPassword.requestFocus()
            }else if (repassword.isNullOrEmpty()) {
                etRePassword.error = resources.getString(R.string.please_reenter_Password)
                etPassword.requestFocus()
            }
            else {
                Toast.makeText(this, resources.getString(R.string.Register_successfully), Toast.LENGTH_SHORT).show()
            }
            etPassword.doOnTextChanged { text, _, _, _ ->
                if((text?.length ?:0) <6){
                    etPassword.error = resources.getString(R.string.at_least_6_numbers)

                }else{
                    etPassword.error = null
                }
                etRePassword.doOnTextChanged { text, _, _, _ ->
                    if((text?.length ?:0) <6){
                        etRePassword.error = resources.getString(R.string.at_least_6_numbers)

                    }else{
                        etRePassword.error = null
                    }
                }
        }
    }
}
 }