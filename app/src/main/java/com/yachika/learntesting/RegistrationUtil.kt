package com.yachika.learntesting

object RegistrationUtil {

    private val userNameList = listOf("Priya", "Neha")

    /**
     * The input is not valid if...
     * ...userName is empty
     * ...userName already exists
     * ...password is empty
     * ...confirmed password is not same as real password
     * ...password should not less that 2 digits
     */

    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }
        if (userName in userNameList) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }

}