package oop_00000114416_Jessiska.week07

fun processEvent(event: BattleState) {
    when (event){
        is BattleState.MonsterEncounter -> {
            println("Monster datang: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Mendapat item: ${event.item.name} (${event.item.rarity})")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Di dalam Safe Zone")
        }
    }
}