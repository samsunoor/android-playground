package net.mnsam.mvvmlogin.authentication

interface AuthenticationMethod {

    fun login(credentials: Credentials, callback: AuthenticationService.Callback)

    fun logout()

    interface Credentials
}