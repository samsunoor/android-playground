package net.mnsam.mvvmlogin

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import net.mnsam.mvvmlogin.authentication.AuthenticationService
import net.mnsam.mvvmlogin.authentication.method.UserPassword
import net.mnsam.mvvmlogin.viewmodel.LoginViewModel
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class LoginUnitTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var authenticationService: AuthenticationService

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun `when login, authentication service should be invoked`() {
        //given
        val loginViewModel = LoginViewModel(authenticationService)

        //when
        loginViewModel.login("fakeusername", "fakepassword")

        //expected
        Mockito.verify(authenticationService).login(any(), any())
    }

    companion object {
        //kotlin helper for explicit non-nullable Mockito.any()
        fun <T> any(): T = Mockito.any<T>()
    }
}