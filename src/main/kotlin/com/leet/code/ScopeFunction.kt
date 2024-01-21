package com.leet.code

data class Student(var firstName: String, var lastName: String)

fun main() {
    val str = "hello"
    //this scope
    //run works as with but as an extension func
    str.run {
        println("The string has length $length")
    }

    //it scope
    str.let {
        println("The string has length ${it.length}")
    }
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers.map { it * 2 }.filter { it > 5 }.let { println(it) }

    //this scope
    val student = Student("John", "Doe")
    student.apply {
        firstName = "Ann"
    }
    println("Student: $student")

    val numbersEven = mutableListOf(2, 4, 6,8)
    with( numbersEven){
        println("The lengh of the list is $size")
        val sum =  numbersEven.sum()
        println("The sum of the list is: $sum")
    }
}