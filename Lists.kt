/*
Kotlin Lists
============
In this tutorial we will discuss about Kotlin Lists. Lists are:

	* An ordered collection of elements.
	 
	* The ordered is maintained through indices (same as arrays).
	 
	* An element can occur more than one time in a list.
	 
	* The mutable list can be considered as a dynamic array whose size can be changed.
	 
	* In Kotlin we can have both a mutable list and an immutable list.

Kotlin Immutable List:
---------------------
Immutable lists are created using List interface. The List interface inherits the Collection interface. It contains many useful functions like contains(), indexOf(), isEmpty() etc. We will see them with the help of an example.

In Kotlin, we can create immutable list using listOf() and listOf<T>() functions. The listOf() function is used to create a general list which can have any object like Integers, Strings, Floats etc. The listOf<T>() is used to create a list of specific type.

Let us create list using these two functions:
*/

fun main() {
    var genericList = listOf("Ninja", 10, 1.05f, 'a')
    var specificList = listOf<String>("Ninja", "Study", "tonight")
    println("Printing $genericList")
    println("Printing $specificList")
}

Printing [Ninja, 10, 1.05, a]
Printing [Ninja, Study, tonight]
/*
OUTPUT:
=======
Here we've created two list, one of generic type and one of strings.

Kotlin Iterate over a list:
*/
fun main() {
    val list = listOf<String>("Ninja", "Study", "tonight", "Ninja", "Kotlin")
    // printing list
    for (element in list)
        println(element)
}

/*
OUTPUT:
=======

Ninja
Study
tonight
Ninja
Kotlin

Kotlin List Functions and Properties:
------------------------------------
Some important functions and properties provided in List interface are:

Properties:
----------

size: Represents the number of elements present in the list.

lastIndex: Represents the index of last element in the list.

Functions:
---------

get(index): Returns the element at the specified index in the list or throws IndexOutOfBoundsException.

contains(element): Returns true if element exists in the list or returns false.

indexOf(element): Returns the index of the first occurrence of the specified element in the list, or -1 if the specified element is not contained in the list.

lastIndexOf(element): Returns the index of the last occurrence of the specified element in the list, or -1 if the specified element is not contained in the list.

first(): Returns first element in list or throws NoSuchElementException if list is empty.

last(): Returns last element in list or throws NoSuchElementException if list is empty.

isEmpty(): Returns true if list is empty else false.

subList(start, end): Returns a sub list between the start (inclusive) and end (exclusive).

The example of the same is:
*/

fun main() {
    val list = listOf<String>("Ninja", "Study", "tonight", "Ninja", "Kotlin")
    // Properties
    println("The size of list is: ${list.size}")
    println("The index of last element is: ${list.lastIndex}")

    // Functions
    println("Element at index 2 is: ${list.get(2)}")
    println("Element at index 3 is: ${list[3]}")     // Other way to get an element

    println("Does Ninja exist in list: ${list.contains("Ninja")}")
    println("Does Hatori exist in list: ${list.contains("Hatori")}")

    println("The first index of Ninja is: ${list.indexOf("Ninja")}")
    println("The first index of Hatori is: ${list.indexOf("Hatori")}")

    println("The last index of Ninja is: ${list.lastIndexOf("Ninja")}")
    println("The last index of Hatori is: ${list.lastIndexOf("Hatori")}")

    println("First element in list: ${list.first()}")
    println("Last element in list: ${list.last()}")

    println("Is list empty: ${list.isEmpty()}")

    println("Sublist from index 1 to 3 ${list.subList(1,3)}")

}

/*
OUTPUT:
=======

The size of list is: 5
The index of last element is: 4
Element at index 2 is: tonight
Element at index 3 is: Ninja
Does Ninja exist in list: true
Does Hatori exist in list: false
The first index of Ninja is: 0
The first index of Hatori is: -1
The last index of Ninja is: 3
The last index of Hatori is: -1
First element in list: Ninja
Last element in list: Kotlin
Is list empty: false
Sublist from index 1 to 3 [Study, tonight]

Kotlin Mutable List
-------------------
Mutable lists are created using MutableList interface. The MutableList interface also inherits the Collection interface. Mutable lists are dynamic in nature. We can add or remove elements from mutable list after its declaration. Hence the size of mutable list is not fixed.

Similar to immutable lists, mutable lists are created using mutableListOf() and mutableListOf<T>() functions. The mutableListOf() function is used to create a general list which can have any object like Integers, Strings, Floats etc. The mutableListOf<T>() is used to create a list of specific type.

Let us create mutable lists using these methods:
*/

fun main() {
    var genericList = mutableListOf("Ninja", 10, 1.05f, 'a')
    var specificList = mutableListOf<String>("Ninja", "Study", "tonight")
    println("Printing $genericList")
    println("Printing $specificList")
}

/*
OUTPUT:
=======

Printing [Ninja, 10, 1.05, a]
Printing [Ninja, Study, tonight]

All the properties and methods which are present in immutable lists are also present in case of mutable lists. Mutable list has some extra functions to support mutability:

add(element): Adds the specified element to the end of the list.

add(index, element): Inserts an element into the list at the specified index.

remove(element): Removes first occurrence of element from list.

removeAt(index): Removes an element at the specified index from the list.

set(index, element): Replaces the element at the specified index in this list with the specified element.

clear(): Removes all elements of the list.

Example using these methods:
*/

fun main() {
    val list = mutableListOf<String>("Ninja", "Study", "tonight", "Ninja", "Kotlin")
    // New Functions
    list.add("Java")
    println(list)
    list.add(2, "C++")
    println(list)
    list.remove("Ninja")
    println(list)
    list.removeAt(1)
    println(list)
    list.set(1, "PHP")
    println(list)
    list.clear()
    println(list)
}

/*
OUTPUT:
=======

[Ninja, Study, tonight, Ninja, Kotlin, Java]
[Ninja, Study, C++, tonight, Ninja, Kotlin, Java]
[Study, C++, tonight, Ninja, Kotlin, Java]
[Study, tonight, Ninja, Kotlin, Java]
[Study, PHP, Ninja, Kotlin, Java]
[]

*/
// font: 
// https://www.studytonight.com/kotlin/kotlin-list
