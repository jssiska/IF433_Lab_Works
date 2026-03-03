package oop_00000114416_Jessiska.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName){
    override fun processPayment(amount: Double){
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar $amount berhasil. Saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("Top up berhasil. Saldo: $balance")
    }
}