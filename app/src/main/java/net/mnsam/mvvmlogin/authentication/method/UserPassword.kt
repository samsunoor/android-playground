package net.mnsam.mvvmlogin.authentication.method

import net.mnsam.mvvmlogin.authentication.AuthenticationServiceImpl
import net.mnsam.mvvmlogin.authentication.AuthenticationMethod
import net.mnsam.mvvmlogin.authentication.AuthenticationService

class UserPassword : AuthenticationMethod {
    override fun login(credentials: AuthenticationMethod.Credentials, callback: AuthenticationService.Callback) {
        TODO("Not yet implemented")
    }

    override fun logout() {
        TODO("Not yet implemented")
    }

    class Credentials(val username: String, val password: String) : AuthenticationMethod.Credentials
}