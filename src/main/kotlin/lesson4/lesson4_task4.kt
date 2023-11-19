fun main() {

    val daysPassed = 5 // Начальное упражнение - руки и пресс

    val multiString = """
    Упражнения для рук:    ${(daysPassed % 2 != 0)}
    Упражнения для ног:    ${(daysPassed % 2 == 0)}
    Упражнения для спины:  ${(daysPassed % 2 == 0)}
    Упражнения для пресса: ${(daysPassed % 2 != 0)}  
    """.trimIndent()

    println(multiString)
}