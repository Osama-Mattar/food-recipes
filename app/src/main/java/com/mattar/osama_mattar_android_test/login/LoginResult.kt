package com.mattar.osama_mattar_android_test.login

import com.mattar.osama_mattar_android_test.login.LoggedInUserView

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)