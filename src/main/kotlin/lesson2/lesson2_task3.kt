const val MIN_PER_HOUR_CONST = 60

fun main() {

    val departingHour = 9 // Часы убытия
    val departingMinutes = 39 // Минуты убытия
    val travelMinutes = 457 // Минут займет путь

    val arrivalMinutes = (departingMinutes + travelMinutes) % MIN_PER_HOUR_CONST // Минуты прибытия
    val arrivalHours = departingHour + (departingMinutes + travelMinutes) / MIN_PER_HOUR_CONST // Часы прибытия

    println("$arrivalHours:$arrivalMinutes")

}