fun main() {

    val ansFirst: Byte = 20
    val ansDouble: Byte = 12

    println("Вам нужно угадать два числа от 0 до 42. Введите числа по порядку:")

    val userAnsFirst = readln().toByte()
    val userAnsSecond = readln().toByte()


    if (((userAnsFirst == ansFirst) && (userAnsSecond == ansDouble)) || ((userAnsFirst == ansDouble) && (userAnsSecond == ansFirst)))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (((userAnsFirst == ansFirst) || (userAnsSecond == ansDouble)) || ((userAnsFirst == ansDouble) || (userAnsSecond == ansFirst)))
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}