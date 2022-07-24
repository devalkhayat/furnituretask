package com.UI.Views.Authentication.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.UI.Views.Home.HomeActivity
import com.example.task_furniture.R
import com.example.task_furniture.databinding.ActivityLoginBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.tasks.Task


class LoginActivity : AppCompatActivity() {

    private  val TAG = "LoginActivity"
   lateinit var googleSignInOptions:GoogleSignInOptions
   lateinit var googleSignInCLient:GoogleSignInClient

    val loginViewModel: LoginViewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java)
    }

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityLoginBinding.inflate(layoutInflater)
       setContentView(binding.root)

        googleSignInOptions=GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build()
        googleSignInCLient= GoogleSignIn.getClient(this,googleSignInOptions)

        binding.btnLogin.setOnClickListener(View.OnClickListener {

            loginViewModel.checkCredentionals(binding.txtUserName.text.toString(),binding.txtPassword.text.toString())
        })

        loginViewModel.data.observe(this,Observer{ it->

            Log.d(TAG, "onCreate: ${ it.message}")

           navigateToMainActivity()
        })

        binding.btnGoogleLogin.setOnClickListener(View.OnClickListener {


            googleSignIn()

        })


    }

    fun googleSignIn(){

       var signInIntent=googleSignInCLient.signInIntent
        startActivityForResult(signInIntent,1000)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        try {
            if(requestCode==1000){

               var task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
                navigateToMainActivity()
               task.result
            }
        } catch (e: Exception) {
        }
    }

    fun navigateToMainActivity(){

        val intent= Intent(LoginActivity@this,HomeActivity::class.java)
        startActivity(intent)
    }

}