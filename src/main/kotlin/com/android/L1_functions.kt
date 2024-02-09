package com.android

fun main() {
    // TODO: Write your code here
}

fun sum(a: Int, b: Int): Int{
    return a + b
    TODO()
}

fun factorial(input: Int): Long {
    return if (input <= 1) {
        1
    } else {
        input.toLong() * factorial(input - 1)
    }
}

fun product(a: Int,b: Int): Int{

    return a * b
}


fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
  TODO()
}


fun Int.square(): Int = this * this

fun multiplyWithDefaultArgument(a: Int, b: Int = 5): Int = a * b

fun multiplyWithNamedArguments(a: Int, b: Int): Int = a * b

fun sumVarargs(vararg numbers: Int): Int = numbers.sum()