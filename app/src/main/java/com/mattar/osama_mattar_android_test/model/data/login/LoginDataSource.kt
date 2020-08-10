package com.mattar.osama_mattar_android_test.model.data.login

import com.mattar.osama_mattar_android_test.model.Result
import com.mattar.osama_mattar_android_test.utilities.FAKE_USER_EMAIL
import java.io.IOException
import java.util.*

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            if (username.toLowerCase().equals(FAKE_USER_EMAIL)) {
                val fakeUser =
                    LoggedInUser(
                        UUID.randomUUID().toString(), username
                    )
                return Result.Success(fakeUser)
            } else {
                return Result.Error(IOException("Error logging in"))
            }

        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}