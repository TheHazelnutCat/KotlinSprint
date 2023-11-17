fun main() {

    val minedCrystal = 7
    val minedIron = 11
    val buff = 20

    val minedCrystalBuff: Int = (minedCrystal * buff / 100)
    val minedIronBuff: Int = (minedIron * buff / 100)

    println("Количество бонусной кристалической руды: $minedCrystalBuff")
    println("Количество бонусной железной руды: $minedIronBuff")
}