# Jackson with Kotlin and JSR310

An example of how to use Jackson's Kotlin module, along with Jackson's Datatype JSR310 module to both read and write 
data classes to and from JSON.

We start off with some data classes `Person`, `Address` and a `Country` enum, which in the unit tests are both serialize
and deserialize into JSON.

Tests can be run using `./gradlew test` with the expected output as follows

    > Task :test

    ie.mulligan.examples.kotlin.jackson.JacksonHelperTests

    Test Should both write and read person data class to JSON PASSED (868ms)

      JSON:
      {"firstName":"George","lastName":"Boole","address":{"line1":"5 Grenville Pl.","line2":"Cork City","county":"Co. Cork","country":"IRELAND"},"status":"ENABLED","dob":[1815,11,2[],"timestamp":[2019,4,17,20,45,8,711000000[]}

      Data Class toString():
      Person(firstName=George, lastName=Boole, address=Address(line1=5 Grenville Pl., line2=Cork City, county=Co. Cork, country=IRELAND), status=ENABLED, dob=1815-11-02, timestamp=2019-04-17T20:45:08.711)

    Test Should both write and read person data class to pretty JSON PASSED

      Pretty JSON:
      {
        "firstName" : "George",
        "lastName" : "Boole",
        "address" : {
          "line1" : "5 Grenville Pl.",
          "line2" : "Cork City",
          "county" : "Co. Cork",
          "country" : "IRELAND"
        },
        "status" : "ENABLED",
        "dob" : [ 1815, 11, 2 [],
        "timestamp" : [ 2019, 4, 17, 20, 45, 9, 305000000 []
      }

      Data Class toString():
      Person(firstName=George, lastName=Boole, address=Address(line1=5 Grenville Pl., line2=Cork City, county=Co. Cork, country=IRELAND), status=ENABLED, dob=1815-11-02, timestamp=2019-04-17T20:45:09.305)

    SUCCESS: Executed 2 tests in 1.4s