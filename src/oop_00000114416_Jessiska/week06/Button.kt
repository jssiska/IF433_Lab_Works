package oop_00000114416_Jessiska.week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}