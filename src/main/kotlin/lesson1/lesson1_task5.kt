fun main() {
    val seconds = 6480 // Количество секунд, которые Гагарин провел в космосе.
    val numberConst = 60
    val minutes = seconds / numberConst // Количество минут
    val hours = seconds / numberConst / numberConst // Количество часов

    // Получаем минуты и часы с вычетом времени, которое уже было отображено
    val minutesOut = minutes - (hours * numberConst)
    val secondsOut = seconds - (minutesOut * numberConst) - (hours * numberConst * numberConst)


    println("0$hours:$minutesOut:0$secondsOut")
}