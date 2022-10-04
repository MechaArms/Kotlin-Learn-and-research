/*
Properties and Methods of String class
======================================

The String class contains many properties and methods which are used to manage Kotlin strings and perform operations on it. 
Some important properties and functions are:

Kotlin String Properties:
-------------------------
*/
length // Represents the length of string.

lastIndex // Represents the index of last character in string.
/*
Kotlin String Methods:
---------------------
*/
get(index) // Returns the character at the specified index in the string or throws IndexOutOfBoundsException.

first() // Returns first character in the string or throws NoSuchElementException if string is empty.

last() // Returns last character in the string or throws NoSuchElementException if string is empty.

plus(string) // Returns a new string obtained by concatenating the string on which this method is called with the string given as parameter. It will not change the actual string as strings are immutable.

subSequence(startIndex, endIndex) // Returns a sub sequence between the startIndex (inclusive) and endIndex (exclusive).

contains(subString, ignoreCase) // Returns true if this string contains the given sub string in it. The ignoreCase parameter is as true/false to specify whether to ignore case or not.

capitalize() // Returns a copy of this string having its first letter uppercased.

decapitalize() // Returns a copy of this string having its first letter lowercased.

reversed() // Returns a string with characters in reversed order.

toLowerCase() // Returns a copy of this string converted to lower case.

toUpperCase() // Returns a copy of this string converted to upper case.

/*
Let us use thesem methods and properties in an example:
-------------------------------------------------------
*/
fun main() {
    var message = "Hello World!!"
    // Properties
    println("Length of string: ${message.length}")
    println("Last index number: ${message.lastIndex}")

    // Functions
    println("Character at index 0: ${message[0]}")
    println("Character at index 1: ${message.get(1)}")
    println("First character in string: ${message.first()}")
    println("Last character in string: ${message.last()}")

    println("Add Bye to message for printing: ${message.plus(" Bye")}")
    println("Subsequence from message: ${message.subSequence(0,5)}")
    println("Message contains 'll'?: ${message.contains("ll")}")

    println("Capitalize message: ${message.capitalize()}")
    println("decapitalize message: ${message.decapitalize()}")
    println("Reversed message: ${message.reversed()}")
    println("Message in lower case: ${message.toLowerCase()}")
    println("Message in upper case: ${message.toUpperCase()}")

}
 
/*
OUTPUT:
=======

Length of string: 13
Last index number: 12
Character at index 0: H
Character at index 1: e
First character in string: H
Last character in string: !
Add Bye to message for printing: Hello World!! Bye
Subsequence from message: Hello
Message contains 'll'?: true
Capitalize message: Hello World!!
decapitalize message: hello World!!
Reversed message: !!dlroW olleH
Message in lower case: hello world!!
Message in upper case: HELLO WORLD!!
*/

// font: 
// https://www.studytonight.com/kotlin/kotlin-string#:~:text=Kotlin%20String%20Methods%3A%201%20get%20%28index%29%3A%20Returns%20the,NoSuchElementException%20if%20string%20is%20empty.%20More%20items...%20
