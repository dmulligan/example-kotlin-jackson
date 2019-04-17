package ie.mulligan.examples.kotlin.jackson

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue


class JacksonHelper {

    private val mapper = ObjectMapper()
        .registerModule(KotlinModule())
        .registerModule(JavaTimeModule())

    private val mapperPretty = mapper.writerWithDefaultPrettyPrinter()

    fun <T> write(entity: T): String = mapper.writeValueAsString(entity)

    fun <T> writePretty(entity: T): String = mapperPretty.writeValueAsString(entity)

    fun readPerson(json: String): Person = mapper.readValue(json)

}