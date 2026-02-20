package oop_00000114416_Jessiska.week03

fun main() {
    val weapon = Weapon("wp")
    weapon.damage = -50
    weapon.damage = 9999
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}