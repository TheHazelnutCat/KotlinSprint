fun main() {

    val rightAnswer = "20; 12"

    println("Вам нужно угадать два числа от 0 до 42. Введите числа по порядку:")

    val userAnswerFirst = readln()
    val userAnswerSecond = readln()


    if ((userAnswerFirst in rightAnswer) && (userAnswerSecond in rightAnswer))
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((userAnswerFirst in rightAnswer) || (userAnswerSecond in rightAnswer))
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}