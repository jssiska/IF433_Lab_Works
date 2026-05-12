package oop_00000114416_Jessiska.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching{
        "42X".toInt()
    }
}