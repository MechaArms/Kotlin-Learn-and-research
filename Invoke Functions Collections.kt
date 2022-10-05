/*
Invoke functions on other collections
=====================================
*/
// Collections can be created in result of various operations on other collections. For example, 
// filtering a list creates a new list of elements that match the filter:

val numbers = listOf("one", "two", "three", "four")  
val longerThan3 = numbers.filter { it.length > 3 }
println(longerThan3) // [three, four]


// Filtering numbers

val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
val evenNumbers = numbers.filter { it % 2 == 0 }
val notMultiplesOf3 = numbers.filterNot { number -> number % 3 == 0 }

println(evenNumbers) // [2, 4, 6]
println(notMultiplesOf3) // [1, 2, 4, 5, 7]


// Mapping produces a list of a transformation results:

val numbers = setOf(1, 2, 3)
println(numbers.map { it * 3 }) // [3, 6, 9]
println(numbers.mapIndexed { idx, value -> value * idx }) // [0, 2, 6]


// If the transformation produces null on certain elements, you can filter out the nulls from the result collection 
// by calling the mapNotNull() function instead of map(), or mapIndexedNotNull() instead of mapIndexed().

val numbers = setOf(1, 2, 3)
println(numbers.mapNotNull { if ( it == 2) null else it * 3 }) // [3, 9]
println(numbers.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx }) // [2, 6]


// Association produces maps:

val numbers = listOf("one", "two", "three", "four")
println(numbers.associateWith { it.length })
// {one=3, two=3, three=5, four=4}
