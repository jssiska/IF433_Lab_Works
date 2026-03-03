package oop_00000114416_Jessiska.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("-> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("-> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }

    val mathHelper = MathHelper()
    println("TEST MATH HELPER")
    println("Luas Persegi (4): ${mathHelper.hitungLuas(4)}")
    println("Luas Persegi Panjang (4 x 5): ${mathHelper.hitungLuas(4, 5)}")
    println("Luas Lingkaran (r = 7.0): ${mathHelper.hitungLuas(7.0)}")

    val eWallet = EWallet(accountName = "Budi", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Andi", limit = 100000.0)
    println()
    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)
    for (method in paymentMethods) {
        method.processPayment(75000.0)
    }
}