package com.yachika.learntesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkGivenByPhillipTest {

    @Test
    fun braces_not_set_correctly_returns_false() {
        val result = HomeworkGivenByPhillip.checkBraces(
            "([{}"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun braces_set_correctly_returns_true() {
        val result = HomeworkGivenByPhillip.checkBraces(
            "(a*b)"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun empty_string_returns_true() {
        val result = HomeworkGivenByPhillip.checkBraces(
            ""
        )
        assertThat(result).isFalse()
    }

}