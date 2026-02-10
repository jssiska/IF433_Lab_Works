package oop_00000114416_Jessiska.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== SISTEM PEMINJAMAN BUKU ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("WARNING: Lama pinjam tidak boleh minus. Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam    : ${loan.borrower}")
    println("Lama Pinjam : ${loan.loanDuration} hari")
    println("Total Denda : Rp ${loan.calculateFine()}")
}