package oop_00000114416_Jessiska.week05

class CreditCard(accountName: String, val limit: Double): PaymentMethod(accountName) {
    var usedAmount: Double = 0.0
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil. Total yang tergunakan: $usedAmount")
        } else {
            println("Transaksi ditolak")
        }
    }
}