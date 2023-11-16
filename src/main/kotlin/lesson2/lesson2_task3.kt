fun main() {

    val timeOutHour = 9 // Время убытия
    val timeOutMinutes = 39 // Время убытия
    val timeWayMinutes = 457 // Минут займет путь
    val numberConst = 60

    val timeWayHours = timeWayMinutes / numberConst

    var timeInMinutes = timeWayMinutes + timeOutMinutes
    val timeInHours = timeOutHour + (timeInMinutes / numberConst)
    timeInMinutes = (timeOutMinutes + timeWayMinutes) - ((timeInMinutes / numberConst) * numberConst)

    println("$timeInHours:$timeInMinutes")


}