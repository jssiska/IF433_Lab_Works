package oop_00000114416_Jessiska.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int{
    require(requestedGram>0) {
        "Porsi kibble harus lebih dari 0 gr"
    }
    if(isJammed){
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(
            requested = requestedGram,
            available = availableGram
        )
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main(){
    println("=== SMART FEEDER ===")
    var currentKibbleStock = 50
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("Dispenser error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Stock error: ${e.message}")
    } catch (e: Exception) {
        println("General error: ${e.message}")
    }finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}