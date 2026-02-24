package oop_00000114416_Jessiska.week04

open class Car(brand: String, val numberofDoors: Int) : Vehicle(brand) {
    fun openTruck() {
        println("Bagasi mobil $brand dengan $numberofDoors pintu dibuka.")
    }
}