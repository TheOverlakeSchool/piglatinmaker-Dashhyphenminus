fun main() {

    val adultCheck: (String, String) -> Boolean = {checkTest, checkPermit -> checkTest.toBoolean()}
    val underAgeCheck: (String, String) -> Boolean = {checkTest, checkPermit -> checkTest.toBoolean() && checkPermit.toBoolean()}

    println("What is your name")
    val name = readln();
    println("How old are you?")
    val age = readln()
    println("Have you passed the driver's test? type True for yes")
    val passedTest = readln();
    println("Do you have a learner's permit? type True for yes")
    val permit = readln();

    if (age.toInt() < 18)
        if (::underAgeCheck (passedTest, permit))
             println ("It is true that $name can drive legally")
            else
             println ("It is false that $name can drive legally")
    else
        if (::adultCheck (passedTest, permit\))
            println ("It is true that $name can drive legally")
        else
            println ("It is false that $name can drive legally")

}


fun adultCheck (checkTest: Boolean, checkPermit: Boolean): Boolean {
    return checkTest
}

fun underAgeCheck (checkTest: Boolean, checkPermit: Boolean): Boolean {
    return checkTest && checkPermit
}