package oop_00000114416_Jessiska.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- Turn Base Game ---")
    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan base damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage = damage)
    var enemyHp = 100
    println("HP Enemy: $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Enemy:$enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang ${hero.name}! Damage: $enemyDamage")
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("Hero kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    if (hero.hp > 0 && enemyHp <= 0) {
        println("\nHero ${hero.name} Wins!")
    } else if (hero.hp <= 0) {
        println("\nEnemy Wins")
    } else {
        println("\nPertarungan dihentikan.")
    }
}
