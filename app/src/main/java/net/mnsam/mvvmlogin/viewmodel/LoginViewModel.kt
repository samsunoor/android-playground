package net.mnsam.mvvmlogin.viewmodel

import androidx.lifecycle.ViewModel
import net.mnsam.mvvmlogin.authentication.AuthenticationService
import net.mnsam.mvvmlogin.authentication.AuthenticationServiceImpl
import net.mnsam.mvvmlogin.authentication.method.UserPassword

class LoginViewModel(private val authenticationService: AuthenticationService) : ViewModel() {

    fun login(username: String, password: String) {
        val credentials = UserPassword.Credentials(username = username, password = password)

        authenticationService.login(credentials, object : AuthenticationService.Callback {
            override fun onSuccess() {
            }

            override fun onFail(e: Exception) {
            }
        })
    }
}