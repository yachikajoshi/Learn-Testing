package com.yachika.learntesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun empty_userName_returns_false() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "12345678",
            "12345678"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun empty_password_returns_false() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sneha",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun userName_already_exist_returns_false() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Neha",
            "12345678",
            "12345678"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun incorrectly_confirmed_password_returns_false() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sneha",
            "1234567890",
            "abcdefg"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun password_less_than_2_digits_returns_false() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "abcdef3",
            "abcdef3"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun valid_userName_and_correctly_written_password_returns_true() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Nitin",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

}