package ie.mulligan.examples.kotlin.jackson

import java.time.LocalDate
import java.time.LocalDateTime

data class Person(
    val firstName: String,
    val lastName: String,
    val address: Address,
    val status: Status,
    val dob: LocalDate,
    val timestamp: LocalDateTime
) {
    enum class Status {
        ENABLED, DISABLED
    }
}

data class Address(
    val line1: String,
    val line2: String,
    val county: String,
    val country: Country
)

enum class Country {
    ENGLAND,
    FRANCE,
    IRELAND
}