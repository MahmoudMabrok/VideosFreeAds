package tool.mahmoudmabrok.videofreeads

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {

        val st = "https://www.youtube.com/ZqrT8ctJ"
        val index = st.lastIndexOf("/")
        val url = st.substring(index + 1)
        assertEquals(url, "ZqrT8ctJ")

    }
}