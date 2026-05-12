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
    var currentKibbleStock = 50
}