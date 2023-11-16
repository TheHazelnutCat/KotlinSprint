const val NUMBER_CONST = 60

fun main() {
    val seconds = 6480 // Количество секунд, которые Гагарин провел в космосе.
    val minutes = seconds / NUMBER_CONST // Количество минут
    val hours = seconds / NUMBER_CONST / NUMBER_CONST // Количество часов

    // Получаем минуты и часы с вычетом времени, которое уже было отображено
    val minutesOut = minutes - (hours * NUMBER_CONST)
    val secondsOut = seconds - (minutesOut * NUMBER_CONST) - (hours * NUMBER_CONST * NUMBER_CONST)


    println("0$hours:$minutesOut:0$secondsOut")
}