package ie.mulligan.examples.kotlin.jackson

import java.time.LocalDate
import java.time.LocalDateTime


fun newPerson(
    firstName: String = "George",
    lastName: String = "Boole",
    address: Address = newAddress(),
    status: Person.Status = Person.Status.ENABLED,
    dob: LocalDate = LocalDate.of(1815, 11, 2),
    timestamp: LocalDateTime = LocalDateTime.now()

) = Person(
    firstName = firstName,
    lastName = lastName,
    address = address,
    status = status,
    dob = dob,
    timestamp = timestamp
)


fun newAddress(
    line1: String = "5 Grenville Pl.",
    line2: String = "Cork City",
    county: String = "Co. Cork",
    country: Country = Country.IRELAND
) = Address(
    line1 = line1,
    line2 = line2,
    county = county,
    country = country
)