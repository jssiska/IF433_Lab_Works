package oop_00000114416_Jessiska.week01

fun main (){
    val gameTitle: String = "Hello"
    val price: Int = 550000
    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 80 / 100
    else price * 90 / 100

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int) {
    println("Title : $title")
    println("Original Price : Rp $originalPrice")
    println("Final Price : Rp $finalPrice")
}