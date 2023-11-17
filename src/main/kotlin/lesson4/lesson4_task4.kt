fun main() {

    val daysPassed = 5
    val initArmAndAbs = true
    val initLegAndBack = false

    val multiString = """
    Упражнения для рук:    ${(daysPassed % 2 != 0) && (initArmAndAbs)}
    Упражнения для ног:    ${(daysPassed % 2 == 0) || (initLegAndBack)}
    Упражнения для спины:  ${(daysPassed % 2 == 0) || (initLegAndBack)}
    Упражнения для пресса: ${(daysPassed % 2 != 0) && (initArmAndAbs)}  
    """.trimIndent()

    println(multiString)
}