package oop_00000114416_Jessiska.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"
    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}