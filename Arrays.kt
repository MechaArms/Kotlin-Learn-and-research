/*
Creation and Properties
=======================

In this tutorial we will discuss about Kotlin Array. An array is a collection of data types. In most of the languages, the array elements should be of same data type, but in Kotlin we can have array containing data of different data types. It means, we can store integer, strings, characters, etc. in the same array.

The properties of an array are:

	* Arrays are 0 index based i.e. first element will have index 0.

	* The size of array is fixed. It cannot be increased or decreased after declaration.

	* Arrays are mutable as array elements can be changed after declaration.

In Kotlin the array can be created using Array<T> class and using some Kotlin functions. We will first see how to create array using functions and later we will see how we can create using the Array class.

Create Array using functions:
-----------------------------
The easiest way to create an array is using arrayOf() function. We can pass the array elements as the parameter while calling the arrayOf() function.

Let us create an array of integers:
*/
	val marks = arrayOf(10,9,3,4,5)
/*	
In the code above, we created an array of integers. As the size of array is fixed, we cannot add elements to this later on. The size of this array will be fixed i.e. 5.

In the above example, the type of array is not mentioned. Hence, different type of elements can be added to this array:
*/
	val differentTypeArray = arrayOf(10,4,5,"Array string", 'c', 10.5f)
/*
As you can see in the code example above, different types of elements are added to this array.

If we want to fix the type the elements in an array, the type can be mentioned at the time of creation of array, like this:
*/
	val marks = arrayOf<Int>(10,4,5,8,9)
/*
Now in the array defined above, only integer values can be stored.

To restrict the array to store data for a specific type only, we can use the type specific functions too in Kotlin. They are:

intArrayOf() - For integer array

charArrayOf() - For character array

byteArrayOf() - For byte array

shortArrayOf() - For short value array

longArrayOf() - For long value array

doubleArrayOf() - For double value array

floatArrayOf() - For float value array

booleanArrayof() - For boolean value array

Let's take a simple code example using all the above functions: */

var intArray = intArrayOf(1,2,3,4,5)
var charArray = charArrayOf('a','b','c')
var byteArray = byteArrayOf(1,2,5,6,7)
var shortArray = shortArrayOf(2,3,5,6)
var longArray = longArrayOf(1,2,3)
var doubleArray = doubleArrayOf(10.0, 1.1, 3.14)
var floatArray = floatArrayOf(10.0f, 3.14f)
var booleanArray = booleanArrayOf(true, false, true)

/*
So if you want to restrict an array to store data of same type, you can do so by using the above, specific type arrayOf functions or use the simple arrayOf function along with type information like <Int>, <Char>, etc.

Create Array using Array class
------------------------------
The Kotlin array can be created using constructor of the Array class. The constructor expects two parameters: first is size of array and second is an init function. The init function is used to initialise the array:
*/

var numbers = Array(3, init = {
    i -> i * 3
})

/*
Here, an array of size 3 is created and initialised by elements using formula index * 3. The array created will contain 0, 3, 6.

Accessing and modifying the Array
---------------------------------
The elements of array can be accessed and modified using get() and set() functions.

The get() function takes only one parameter: index of the element.

Where as, the set() function takes two parameters: first as index of the element and second as new value for that index.

Let's take a code example,
*/

fun main() {
    val marks = arrayOf<Int>(10,4,5,8,9)
    println(marks.get(0))
    println(marks.get(1))
    // update the value of the first element of the array
    marks.set(0,100)
    println(marks.get(0))
}

/*
OUTPUT:
=======

10
4
100

Instead of using get() and set(), we can also use [] to access array elements providing the index value within the square brackets. The above code using [] can be written as:
*/

fun main() {
    val marks = arrayOf<Int>(10,4,5,8,9)
    println(marks[0])
    println(marks[1])
    // setting new value for first element of array
    marks[0] = 100
    println(marks[0])
}

/*
OUTPUT:
=======

10
4
100

Get Size of the Array
---------------------
The size of Kotlin array can be found using its size property:
*/

fun main() {
    val marks = arrayOf<Int>(10,4,5,8,9)
    println(marks.size)
}

/*
OUTPUT:
=======

5

Traversing the Array
--------------------
An array can be traversed using for loop. Here is a simple code example,
*/

fun main() {
    val marks = arrayOf<Int>(10,4,5,8,9)
    for (i in marks)
        println(i)
}

/*
OUTPUT:
=======

10
4
5
8
9

Array elements can also be accessed using forEach() in Kotlin:
*/

fun main() {
    val marks = arrayOf<Int>(10,4,5,8,9)
    marks.forEach { i ->
        println(i)
    }
}

/*
OUTPUT:
=======

10
4
5
8
9

*/
// font: 
// https://www.studytonight.com/kotlin/kotlin-array
