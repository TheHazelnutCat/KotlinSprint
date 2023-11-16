const val NUMBER_CONST = 60

fun main() {

    val timeOutHour = 9 // Время убытия
    val timeOutMinutes = 39 // Время убытия
    val timeWayMinutes = 457 // Минут займет путь

    val timeWayHours = timeWayMinutes / NUMBER_CONST

    var timeInMinutes = timeWayMinutes + timeOutMinutes
    val timeInHours = timeOutHour + (timeInMinutes / NUMBER_CONST)
    timeInMinutes = (timeOutMinutes + timeWayMinutes) - ((timeInMinutes / NUMBER_CONST) * NUMBER_CONST)

    println("$timeInHours:$timeInMinutes")


}