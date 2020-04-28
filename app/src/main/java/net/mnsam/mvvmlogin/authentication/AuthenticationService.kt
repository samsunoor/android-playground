package net.mnsam.mvvmlogin.authentication

interface AuthenticationService {

    fun login(credentials: AuthenticationMethod.Credentials, callback: Callback)

    fun logout()

    interface Callback {
        fun onSuccess()

        fun onFail(e: Exception)
    }
}