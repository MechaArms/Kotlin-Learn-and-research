/*
Kotlin Map
==========
In this tutorial we will discuss about Kotlin Map. Maps are used to store key and value pairs. Both key and value are user defined. In Map:

      * The key should be unique and only one value can be stored for each unique key.

      * Values can be duplicate.

      * The key and value can be of different data type.

      * The to keyword is used to map a key to a value.

      * A key value pair is also known as an entry.

      * In Kotlin we can have both a mutable map and an immutable map.

Kotlin Immutable Map
--------------------
Immutable maps are created using Map<K, V> interface. We can only read from immutable maps.

In Kotlin immutable maps are created using mapOf() and mapOf<K, V>() functions. Similar to lists, the mapOf() function is used to create a general map where key and value can be of any data type. The mapOf<K, V>() is used to create a specific map with keys and values of K and V data types respectively.

Let us create immutable map using these two functions:
*/
fun main() {
    val generalMap = mapOf("Rank" to 1, 1 to "First", 'A' to "Excellent")
    val specificMap = mapOf<String, Int>("Physics" to 80, "Maths" to 97, "C++" to 89)
    println(generalMap)
    println(specificMap)
}
/*
OUTPUT:
=======
{Rank=1, 1=First, A=Excellent}
{Physics=80, Maths=97, C++=89}

Let us iterate over these maps using for and forEach loop:
*/
fun main() {
    val generalMap = mapOf("Rank" to 1, 1 to "First", 'A' to "Excellent")
    val specificMap = mapOf<String, Int>("Physics" to 80, "Maths" to 97, "C++" to 89)
    for ((k,v) in generalMap) {
        println("Key is: $k and Value is $v")
    }
    specificMap.forEach { (k, v) ->
        println("Key is: $k and Value is $v")
    }
}
/*
OUTPUT:
=======
Key is: Rank and Value is 1
Key is: 1 and Value is First
Key is: A and Value is Excellent
Key is: Physics and Value is 80
Key is: Maths and Value is 97
Key is: C++ and Value is 89

Kotlin Map Properties and Functions
-----------------------------------
Some important functions and properties provided in Map interface are:

Properties:
----------
*/
size // Returns the size of map.

entries // Returns the set of all key-value pairs in the map.

keys // Returns the set of all keys in the map.

values // Returns the set of all values in the map.
/*
Functions:
---------
*/
get(key) // Returns the value for corresponding key. If key is absent then returns null.

getValue(key) // Returns the value for the given key or throws NoSuchElementException exception if there is no such key in the map.

contains(key) // Returns true if the map contains the specified key else false.

containsKey(key) // Returns true if the map contains the specified key else false. This function is same as earlier one.

containsValue(value) // Returns true if there are one or more keys to the specified value are present in map.

getOrDefault(key, defaultValue) // Returns the value corresponding to the key, or defaultValue if such a key is not present in the map.

// The example using these methods and properties is:

package collections

fun main() {
    val marks = mapOf<String, Int>("Physics" to 80, "Maths" to 97, "C++" to 89, "Chemistry" to 95)

    // Properties
    println("Size of map: ${marks.size}")
    println("Set of entries: ${marks.entries}")
    println("Set of keys: ${marks.keys}")
    println("Set of values: ${marks.values}")

    // Methods
    println("Marks in Physics: ${marks.get("Physics")}")
    println("Marks in English: ${marks["English"]}")
    println("Marks in Maths: ${marks.getValue("Maths")}")

    println("Does map contains Physics: ${marks.containsKey("Physics")}")
    println("Does map contains C++: ${marks.contains("C++")}")
    println("Does map contains Chemistry: ${"Chemistry" in marks}")

    println("Does any subject has 100 marks: ${marks.containsValue(100)}")

    println("Marks in English: ${marks.getOrDefault("English",0)}")
}
/*
OUTPUT:
=======
Size of map: 4
Set of entries: [Physics=80, Maths=97, C++=89, Chemistry=95]
Set of keys: [Physics, Maths, C++, Chemistry]
Set of values: [80, 97, 89, 95]
Marks in Physics: 80
Marks in English: null
Marks in Maths: 97
Does map contains Physics: true
Does map contains C++: true
Does map contains Chemistry: true
Does any subject has 100 marks: false
Marks in English: 0

Kotlin Mutable Map
------------------

Mutable maps are created using MutableMap interface. Mutable maps supports dynamic nature. We can add or remove or update entries from mutable map after its declaration. Hence the size of mutable map is not fixed.

Mutable maps are created using mutableMapOf() and mutableMapOf<K, V>() functions. The mutableMapOf() function is used to create a generalised map and the mutableMapOf<K, V>() is used to create a map of specific key and value data type.

Let us create mutable maps using these methods:
*/
fun main() {
    val generalMap = mutableMapOf("Rank" to 1, 1 to "First", 'A' to "Excellent")
    val specificMap = mutableMapOf<String, Int>("Physics" to 80, "Maths" to 97, "C++" to 89)
    println(generalMap)
    println(specificMap)
}
/*
OUTPUT:
=======
{Rank=1, 1=First, A=Excellent}
{Physics=80, Maths=97, C++=89}

We can iterate over mutable maps in similar way we iterated immutable maps.

All the properties and methods which are present in immutable maps are also present in case of mutable maps. Mutable maps have some extra functions to support dynamic nature. They are:
*/
put(key, value) // Adds the specified key value pair to the map. If key already exists it will replace the value.

putIfAbsent(key, value) // Adds the specified key value pair to the map only if key does not exist earlier.

replace(key, newValue) // Replaces the value for specified key with new value.

replace(key, oldValue, newValue) // Replaces the old value with new value for the specifies key only if key and oldValue pair exists.

remove(key) // Remove entry with specified key from map.

remove(key, value) // Remove entry from map if entry with specified key and value exists.

clear() // Removes all entries from the map.

// Example using these methods:

fun main() {
    val marks = mutableMapOf<String, Int>("Physics" to 80, "Maths" to 97, "C++" to 89, "Chemistry" to 95)

    marks.put("C++", 92)
    println(marks)
    marks["Chemistry"] = 93
    println(marks)
    marks.putIfAbsent("English", 95)
    marks.putIfAbsent("Physics", 0)
    println(marks)
    marks.replace("Maths", 70)
    println(marks)
    marks.replace("Maths", 70, 95)
    println(marks)
    marks.remove("C++")
    println(marks)
    marks.remove("Maths", 95)
    println(marks)
    marks.clear()
    println(marks)
}
/*
OUTPUT:
=======
{Physics=80, Maths=97, C++=92, Chemistry=95}
{Physics=80, Maths=97, C++=92, Chemistry=93}
{Physics=80, Maths=97, C++=92, Chemistry=93, English=95}
{Physics=80, Maths=70, C++=92, Chemistry=93, English=95}
{Physics=80, Maths=95, C++=92, Chemistry=93, English=95}
{Physics=80, Maths=95, Chemistry=93, English=95}
{Physics=80, Chemistry=93, English=95}
{}

// font: 
// https://www.studytonight.com/kotlin/kotlin-map
