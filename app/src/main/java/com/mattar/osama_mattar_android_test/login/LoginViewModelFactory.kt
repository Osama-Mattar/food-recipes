package com.mattar.osama_mattar_android_test.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mattar.osama_mattar_android_test.model.data.login.LoginDataSource
import com.mattar.osama_mattar_android_test.model.repository.LoginRepository

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class LoginViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                loginRepository = LoginRepository(
                    dataSource = LoginDataSource()
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}