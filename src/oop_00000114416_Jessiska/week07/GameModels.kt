package oop_00000114416_Jessiska.week07

enum class ItemRarity(val dropChance: Int){
    COMMON(70), UNCOMMON(18), RARE(8), EPIC(3), LEGENDARY(1)
}
data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)