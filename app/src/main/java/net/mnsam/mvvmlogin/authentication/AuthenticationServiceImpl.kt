package net.mnsam.mvvmlogin.authentication

import net.mnsam.mvvmlogin.authentication.method.UserPassword

class AuthenticationServiceImpl(private val userPasswordAuthentication: UserPassword) {

    fun login(credentials: AuthenticationMethod.Credentials, callback: AuthenticationService.Callback) {
        if (credentials is UserPassword.Credentials) {
            userPasswordAuthentication.login(credentials, callback)
        }
    }
}