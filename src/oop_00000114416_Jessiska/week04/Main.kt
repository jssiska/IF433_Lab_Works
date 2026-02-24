package oop_00000114416_Jessiska.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTruck()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Tesla", 4, 80)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTruck()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager("John", 7000000)
    val developer = Developer("Ucup", 5000000, "Kotlin")
    manager.work()
    println("Bonus manager: ${manager.calculateBonus()}")
    developer.work()
    println("Bonus employee: ${developer.calculateBonus()}")
}