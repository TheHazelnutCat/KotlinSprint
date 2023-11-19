const val AGE_OF_MAJORITY = 18

fun main() {

    val userYear = readLine()!!.toShort()
    val nowYear: Short = 2023

    if ((nowYear - userYear) >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Вернуться на главный экран")
}