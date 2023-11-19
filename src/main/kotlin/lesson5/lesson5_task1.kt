fun main() {

    val numberFirst = 5
    val numberSecond = 8
    val numberSum = numberFirst + numberSecond
    println("Напишите правильный ответ: $numberFirst + $numberSecond = ?")

    val userAnswer = readln().toInt()

    if (userAnswer == numberSum)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}