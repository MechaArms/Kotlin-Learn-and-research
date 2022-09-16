// range  = (nInicio..nFinal)

fun main() {
  for (i in 1..5){
    println("Hello, Person!")  	// repete 5 vezes
    println("i = $i")    		// i = 1, i = 2... i = 10
  }  
}

// Controlling the Iteration

// downTo  = range reverse
// until = normal range sem o ultimo valor da contagem
// step = renge pulando por uma quantidade por exemplo contar de 2 em 2


// Using a integer number order

for(i in 0..3) {             // loop 0 to 3
    print(i)
}
print(" ")

for(i in 0 until 3) {        // loop 0 to 2
    print(i)
}
print(" ")

for(i in 2..8 step 2) {      // loop 2 to 8 jumping 2
    print(i)
}
print(" ")

for (i in 3 downTo 0) {      // loop 3 to 0
    print(i)
}
print(" ")

// OUTPUT
//0123 012 2468 3210 


// Using a char range in alphabetical order

for (c in 'a'..'d') {        // 1
    print(c)
}
print(" ")

for (c in 'z' downTo 's' step 2) { // 2
    print(c)
}
print(" ")

// OUTPUT
// abcd zxvt 


// Checks if a value is in the range

val x = 2
if (x in 1..5) {            // 1
    print("x is in range from 1 to 5")
}
println()

if (x !in 6..10) {          // 2
    print("x is not in range from 6 to 10")
}

// x is in range from 1 to 5
// x is not in range from 6 to 10
