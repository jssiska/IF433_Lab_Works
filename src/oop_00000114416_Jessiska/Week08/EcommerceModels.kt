package oop_00000114416_Jessiska.Week08

sealed class Product
data class Electronic(
    val id:String,
    val name:String,
    val warrantyMoths: Int) : Product()

data class Clothing(
    val id: String,
    val name: String,
    val size: String) : Product()