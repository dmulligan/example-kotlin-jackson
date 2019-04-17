package ie.mulligan.examples.kotlin.jackson

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.Test


class JacksonHelperTests {

    @Test
    fun `Should both write and read person data class to JSON`() {
        val helper = JacksonHelper()

        val person = newPerson()

        val json = helper.write(person)
        println("JSON:\n$json\n\n")

        val result = helper.readPerson(json)
        assertThat(result, equalTo(person))
        println("Data Class toString():\n$result\n\n")
    }

    @Test
    fun `Should both write and read person data class to pretty JSON`() {
        val helper = JacksonHelper()

        val person = newPerson()

        val json = helper.writePretty(person)
        println("Pretty JSON:\n$json\n\n")

        val result = helper.readPerson(json)
        assertThat(result, equalTo(person))

        println("Data Class toString():\n$result\n\n")
    }

}