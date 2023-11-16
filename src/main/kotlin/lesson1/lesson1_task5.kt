fun main() {
    val seconds = 6480 // Количество секунд, которые Гагарин провел в космосе.
    val minutes = seconds / 60 // Количество минут
    val hours = seconds / 60 / 60 // Количество часов

    val minutesOut = minutes - (hours * 60) // Получаем минуты с вычетом часов
    val secondsOut = seconds - (minutesOut * 60) - (hours * 60 * 60) // Получаем секунды с вычетом часов и минут



    println("0$hours:$minutesOut:0$secondsOut")
}