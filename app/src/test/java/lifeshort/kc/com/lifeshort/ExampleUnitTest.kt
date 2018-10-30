package lifeshort.kc.com.lifeshort

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun main0() {
        //
        println("Hello World!")
        //
        println(max(1, 2))
        //
        val s = "china"
        println("Hello , ${s}!")
        //
        println("Hello ${if (isAbove0(0)) "above0" else "below or queal 0"}!")
        //
    }

    fun max(a : Int, b : Int) : Int {
        return if (a > b) a else b;
    }

    fun isAbove0(a : Int) : Boolean {
        return a > 0
    }
}
