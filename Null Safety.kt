/*
Kotlin Null Safety
==================
In this tutorial we will discuss about one of the most important features of Kotlin: Null Safety. In programming world when a variable doesn't refer to anything then it is considered as null. If we try to use this variable then we will get NullPointerException or NPE.

Let us see a small example in Java where NullPointerException occurs:
*/

public class Student {
    public static void main(String[] args) {
        Integer rollNo = null;
        Integer nextRollNo = rollNo + 1;
        System.out.println("Roll No. of next student: " + nextRollNo);
    }
}
/*
OUTPUT:
=======
Exception in thread "main" java.lang.NullPointerException
at Student.main(Student.java:4)


NullPointerException is considered as a billion dollar mistake as it leads to termination of program abruptly. The NullPointerException can occur anywhere in the code due to negligence.

Kotlin tackles this problem by providing a mechanism to deal with NullPointerException. Kotlin aims to remove NPE from our entire code. Let us discuss about the functionality given for it.

Nullable and Non-Null References
--------------------------------
In Kotlin, the type system differentiates between two types of references:

      1.Nullable Reference: These references can hold null values.

      2.Non-Null Reference: These references can't hold null values.

These references are interpreted by compiler at the compile time. The compiler by default considers all variables as Non-Null Reference.

Let us understand them with examples:
*/

fun main() { 
    var name:String = null   // ERROR
}
/*
OUTPUT:
=======
Error:(2, 23) Kotlin: Null can not be a value of a non-null type String

Here, by default compiler considers name variable as a Non-Null reference. So, we cannot assign null to it. It removes chances of getting Null Pointer Exception later when we use this name variable.

To allow a variable to hold null values also we use ? after data type:
*/
fun main() {
    var name:String? = null    // NO ERROR
}

// Here we deliberately allowed name variable to hold null values. But now it may throw Null Pointer Exception when we try to use it. Kotlin will take care of Nullable References also. If we try to use it as:

fun main() {
    var name:String? = "Ninja"
    println(name.length)     // ERROR
}
/*
OUTPUT:
=======
Error:(3, 17) Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

Here compiler is not allowing us to find length of the String directly because it may throw Null Pointer Exception.

Now to call the properties and functions on nullable references, we can do one of the following:

      1.Check null in conditions

      2.Safe calls

      3.The Elvis operator

      4.The !! operator

Let us discuss these methods in detail and see how they allows us to use Nullable references and also take care of NPE.

Check Null in Conditions
------------------------
If we wants to call a function or use a property on a nullable reference (like using name.length on name variable), we can check null condition first and then use it:
*/

fun main() {
    var name:String? = "Ninja"
    if (name != null)
        println(name.length)
}
/*
OUTPUT:
=======
5

Now compiler won't give any error as we have already checked null condition first. It is the most basic way to deal with Nullable Reference. But at the same time, it is tedious to use it everywhere in program.

Safe Calls
----------
What if we want:

name.length to return length of name, if name is not null.

Or return null if name is null

We can achieve this using safe call operator (?.). Let us use it in the same example:
*/
fun main() {
    var name:String? = "Ninja"
    println("Length of name is ${name?.length}")

    name = null
    println("Length of name is ${name?.length}")
}
/*
OUTPUT:
=======
Length of name is 5
Length of name is null

The safe call operator is similar to:
*/

if(name != null)
    // return length
else
    // return null

/*
The Elvis Operator
------------------
The safe call operator return null if the variable used is null. Suppose we want:

name.length to return length of name if name is not null.

Or given a specific value if name is null.

We can achieve this using Elvis operator (?:):
*/
fun main() {
    var name:String? = "Ninja"
    println("Length of name is ${name?.length ?: -1}")

    name = null
    println("Length of name is ${name?.length ?: -1}")
}
/*
OUTPUT:
=======
Length of name is 5
Length of name is -1

Here we've combined the safe call operator and the elvis operator.

The !! operator
The !! operator allows us to change a Nullable reference to a Non-null reference. Now it will throw Null pointer exception if we try to use it. The Kotlin compiler will not take care of it anymore.

So, if we try to use it in this case:
*/
fun main() {
    var name:String? = "Ninja"
    println("Length of name is ${name!!.length}") // prints 5
}

// It will work fine. But if we try to use it in this case:

fun main() {
    var name:String? = null
    println("Length of name is ${name!!.length}") // Throws NullPointerException
}

// So, the !! operator should be avoided as much as possible.
/*
// font: 
// https://www.studytonight.com/kotlin/kotlin-null-safety
