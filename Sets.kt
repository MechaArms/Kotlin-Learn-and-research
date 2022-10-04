/*
Kotlin Set
==========
In this tutorial we will discuss about Kotlin Sets. Sets are:

    * An unordered collection of elements.

    * Duplicate elements are not allowed in sets.

In Kotlin we can have both a mutable set and an immutable set.

Kotlin Immutable Set
--------------------
Immutable Sets are created using Set interface. The Set interface inherits the Collection interface.

In Kotlin, we can create immutable set using setOf() and setOf<T>() functions. The setOf() function is used to create a general set which can have any object like Integers, Strings, Floats etc. The setOf<T>() is used to create a set of specific type.

Let us create set using these two functions:
*/
fun main() {
    val genericSet = setOf("Hello", 1, "Bye", 'A', "Hello")
    val specificSet = setOf<String>("C++", "Maths", "English")
    println(genericSet)
    println(specificSet)
}
/*
OUTPUT:
=======
[Hello, 1, Bye, A]
[C++, Maths, English]

Here we've created two sets, one of generic type and one of strings.

Iterate over a set:
*/
fun main() {
    val genericSet = setOf("Hello", 1, "Bye", 'A', "Hello")
    for (item in genericSet)
        println(item)
}
/*
OUTPUT:
=======
Hello 1 Bye A

Kotlin Set Properties and Functions
-----------------------------------
Some important functions and properties provided in Set interface are:

Properties:
----------
*/
size // Represents the number of elements present in the set.
/*
Functions:
----------
*/
elementAt(index) // Returns the element at the specified index in the set or throws IndexOutOfBoundsException.

contains(element) // Returns true if element exists in the set or returns false.

indexOf(element) // Returns the index of the specified element in the set, or -1 if the specified element is not present in the set.

lastIndexOf(element) // Returns the index of the last occurrence (or the only occurrence) of the specified element in the set, or -1 if the specified element is not present in the set.

first() // Returns first element in set or throws NoSuchElementException if set is empty.

last() // Returns last element in set or throws NoSuchElementException if set is empty.

isEmpty() // Returns true if set is empty else false.

count() // Returns the number of elements in this collection.

max() // Returns the largest element or null if there are no elements.

min() // Returns the smallest element or null if there are no elements.

sum() // Returns the sum of all elements in this collection.

average() // Returns the average of all elements in this collection.

//The example of the same is:

fun main() {
    val languages = setOf<String>("Kotlin", "C++", "C", "Java", "Angular", "Kotlin")
    val marks = setOf<Int>(95,96,94,90)

    // Properties
    println("The size of set is: ${languages.size}")

    // Functions
    println("Does Java exist in set: ${languages.contains("Java")}")
    println("Does PHP exist in set: ${languages.contains("PHP")}")
    println("Element at index 1: ${languages.elementAt(1)}")

    println("The index of Kotlin is: ${languages.indexOf("Kotlin")}")
    println("The index of PHP is: ${languages.indexOf("PHP")}")

    println("The last index of Kotlin is: ${languages.lastIndexOf("Kotlin")}")

    println("First element in set: ${languages.first()}")
    println("Last element in set: ${languages.last()}")

    println("Is set empty: ${languages.isEmpty()}")

    // Mathematical functions
    println("No. of elements in set: ${marks.count()}")
    println("Max element in set: ${marks.max()}")
    println("Min element in set: ${marks.min()}")
    println("Sum of elements in set: ${marks.sum()}")
    println("Average of elements in set: ${marks.average()}")
}
/*
OUTPUT:
=======
The size of set is: 5
Does Java exist in set: true
Does PHP exist in set: false
Element at index 1: C++
The index of Kotlin is: 0
The index of PHP is: -1
The last index of Kotlin is: 0
First element in set: Kotlin
Last element in set: Angular
Is set empty: false
No. of elements in set: 4
Max element in set: 96
Min element in set: 90
Sum of elements in set: 375
Average of elements in set: 93.75

Kotlin Mutable Set
------------------
Mutable sets are created using MutableSet interface. The MutableSet interface also inherits the Collection interface. Mutable sets are dynamic in nature. We can add or remove elements from mutable set after its declaration. Hence the size of mutable set is not fixed.

Similar to immutable sets, mutable sets are created using mutableSetOf() and mutableSetOf<T>() functions. The mutableSetOf() function is used to create a general set while mutableSetOf<T>() is used to create a set of specific type.

Let us create mutable sets using these methods:
*/
fun main() {
    val generalSet = mutableSetOf("Kotlin", 10, 1.0f, 'A', "Kotlin")
    val specificSet = mutableSetOf<String>("Kotlin", "C++", "C", "Java", "Angular", "Kotlin")
    println(generalSet)
    println(specificSet)
}
/*
OUTPUT:
=======
[Kotlin, 10, 1.0, A]
[Kotlin, C++, C, Java, Angular]

All the properties and methods which are present in immutable sets are also present in case of mutable sets. Mutable sets have some extra functions to support mutability:
*/
add(element) // Adds the specified element to the set. Returns true if the element has been added, false if the element is already contained in the set.

remove(element) // Removes element from set.

clear() // Removes all elements of the set.

// Example using these methods:

fun main() {
    val languages = mutableSetOf<String>("Kotlin", "C++", "C", "Java", "Kotlin")
    println(languages)
    languages.add("Angular")
    println(languages)
    languages.remove("Java")
    println(languages)
    languages.clear()
    println(languages)
}
/*
OUTPUT:
=======
[Kotlin, C++, C, Java]
[Kotlin, C++, C, Java, Angular]
[Kotlin, C++, C, Angular]
[]

// font: 
// https://www.studytonight.com/kotlin/kotlin-set
