package oop_00000114416_Jessiska.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}