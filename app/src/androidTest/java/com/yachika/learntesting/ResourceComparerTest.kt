package com.yachika.learntesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ResourceComparerTest {
    /**
     * Initializing the class Globally is bad practise.
     * All our test should run independent of each other
     * but right now they rely on the same instance of class.
     *......Alternative way......
     *  make class variable 'private lateinit var resourceComparer : ResourceComparer'
     */

    /**
     *  But what if we have 30 tests in this class? To remove boiler plate code...
     * ... we have @Before annotation which execute before all test runs
     * @Before
     * fun setup(){ resourceComparer = ResourceComparer()}
     */

    /**
     * We have @After annotation which execute after all test runs
     * e.g.  close database after all tests
     * @After
     * fun tearDown(){}
     */

    private val resourceComparer = ResourceComparer()

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEmpty(
            context,
            R.string.app_name,
            "Learn Testing"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEmpty(
            context,
            R.string.app_name,
            "LearnTestCases"
        )
        assertThat(result).isFalse()
    }
}