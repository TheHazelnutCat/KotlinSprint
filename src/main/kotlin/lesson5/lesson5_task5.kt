import kotlin.random.Random

fun main() {

    val rightAnswers = List(3) { Random.nextInt(0, 42) }

    println("Вам нужно угадать 3 числа от 0 до 42. Введите числа поочередно:")
    val userAnswers = List(3) { readln().toInt() }

    val intersectNumbers = rightAnswers.intersect(userAnswers).size

    when (intersectNumbers) {
        3 -> println("Вы угадали 3 числа и выйграли джекпот!")
        2 -> println("Вы угадали 2 числа и получаете крупный приз!")
        1 -> println("Вы угадали 1 число и получаете утешительный приз.")
        0 -> println("К сожалению, вы не угадали ни одного числа.")
    }
    println("Выигрышными числами были: $rightAnswers")
}