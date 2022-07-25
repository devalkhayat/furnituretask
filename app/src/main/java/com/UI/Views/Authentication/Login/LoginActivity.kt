package com.UI.Views.Authentication.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.UI.Views.Home.HomeActivity
import com.example.task_furniture.databinding.ActivityLoginBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.tasks.Task


class LoginActivity : AppCompatActivity() {

    private  val TAG = "LoginActivityssss"
   lateinit var googleSignInOptions:GoogleSignInOptions
   lateinit var googleSignInCLient:GoogleSignInClient
   lateinit var binding: ActivityLoginBinding
    val loginViewModel: LoginViewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding=ActivityLoginBinding.inflate(layoutInflater)
       setContentView(binding.root)

      googleSignInOptions=GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build()
      googleSignInCLient= GoogleSignIn.getClient(this,googleSignInOptions)

       events()
       observers()
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        try {
            if(requestCode==1000){

               var task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)

               if( task.isSuccessful==true){

                   navigateToMainActivity()
                }

            }
        } catch (e: Exception) {
        }
    }
    fun observers(){

        loginViewModel.data.observe(this,Observer{ it->
            if(it.status){
                navigateToMainActivity()
            }else{
                Toast.makeText(this,it.message,Toast.LENGTH_LONG).show()
            }

        })
    }
    fun events(){
        binding.btnLogin.setOnClickListener(View.OnClickListener {

            loginViewModel.checkCredentionals(binding.txtUserName.text.toString(),binding.txtPassword.text.toString())
        })
        binding.btnGoogleLogin.setOnClickListener(View.OnClickListener {


            googleSignIn()

        })
    }
    fun navigateToMainActivity(){

        val intent= Intent(LoginActivity@this,HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun googleSignIn(){

        var signInIntent=googleSignInCLient.signInIntent
        startActivityForResult(signInIntent,1000)


    }

}