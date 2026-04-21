package oop_00000114416_Jessiska.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 6, 12.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 5, -3.5, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 8.5, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 15, 5.0, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -1.5, "OPEN"),
        TradeLog("XRPUSDT", "LONG", 8, 20.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
}