package oop_00000114416_Jessiska.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Damage tidak boleh negatif")
            } else if (value > 1000) {
                println("(OVERPOWERED)")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}