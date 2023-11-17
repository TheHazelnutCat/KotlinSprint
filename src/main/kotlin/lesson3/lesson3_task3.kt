fun main() {

    val numberMultiply: Byte = 5
    val multiString = """
        $numberMultiply * 1 = ${numberMultiply * 1}
        $numberMultiply * 2 = ${numberMultiply * 2}
        $numberMultiply * 3 = ${numberMultiply * 3}
        $numberMultiply * 4 = ${numberMultiply * 4}
        $numberMultiply * 5 = ${numberMultiply * 5}
        $numberMultiply * 6 = ${numberMultiply * 6}
        $numberMultiply * 7 = ${numberMultiply * 7}
        $numberMultiply * 8 = ${numberMultiply * 8}
        $numberMultiply * 9 = ${numberMultiply * 9}
    """.trimIndent()

    println(multiString)
}