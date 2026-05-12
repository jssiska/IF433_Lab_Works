package oop_00000114416_Jessiska.week12

fun divide(a: Int, b: Int): Int {
    try{
        return a / b
    } catch(e:ArithmeticException){
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}