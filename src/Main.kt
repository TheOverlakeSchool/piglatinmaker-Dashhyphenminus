//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Create a Scanner object with an identifier getData that takes in information
    // from System.in (import Scanner, then "val reader = Scanner(System.`in`)")
    // UNTRANSLATED: We'll use readline later to get the data.

    // Ask the user for a word
    println("Enter your sentence here:")

    // Declare a String named enteredTerm and initialize it to the next word
    // read in from getData
    val enteredTerm = readlnOrNull()

    var sentence = "$enteredTerm "


    // Clear out the buffer by calling nextLine on getData. UNTRANSLATED.

    // Declare a String with an identifier convertedTerm, initialized to an empty String
    val convertedTerms = ArrayList<String>()

    while (sentence.indexOf(' ') !in -1..0) {
        val word = sentence.substring(0, sentence.indexOf(' '))
        val firstLetter = word.substring(0,1)
        sentence = sentence.substring(sentence.indexOf(' ') + 1)

        convertedTerms.add(when (firstLetter) {
                "a", "e", "i", "o", "u" -> word + "yay"
                else -> word.substring(1) + word.substring(0, 1) + "ay"
            }
        )
    }

    // Declare a String with an identifier firstLetter, initialized to a substring of
    // enteredWord starting at index 0 and ending at index 1. We'll use substring as normal

    // If firstLetter is a vowel (note - this is five conditions using OR logic)
        //Set convertedTerm to enteredterm concatenated with "yay"
    // otherwise
        // Set convertedTerm to a substring of enteredTerm from index 1 to the end, concatenated
        // with a substring of enteredTerm from index 0 to index 1, concatenated with "ay"
    // TRANSLATED: When becomes a better control structure to use here

    // var words = arrayOf()


    // Print that the Pig Latin Version of the enteredTerm is your convertedTerm

    print("The Pig Latin Version of \"$enteredTerm\" is ")

    for (word in convertedTerms) {
        print ("$word ")
    }




}