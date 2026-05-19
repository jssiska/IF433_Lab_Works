package oop_00000114416_Jessiska.week13
import java.io.File

fun main(){
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.kt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    writer.close()
    println("Proses penulisan unsafe selesai.")
}