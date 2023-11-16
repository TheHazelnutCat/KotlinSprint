fun main() {

    val minedCrystal = 7
    val minedIron = 11
    val Buff: Float = 20f / 100f

    val minedCrystalBuff: Int = (minedCrystal * Buff).toInt()
    val minedIronBuff: Int = (minedIron * Buff).toInt()

    println("Количество бонусной кристалической руды: $minedCrystalBuff")
    println("Количество бонусной железной руды: $minedIronBuff")
}