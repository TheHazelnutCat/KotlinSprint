fun main() {

    println("Напишите правильный ответ: 5 + 8 = ?")

    val userAnswer = readLine()!!.toInt()

    if (userAnswer == (5 + 8))
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}