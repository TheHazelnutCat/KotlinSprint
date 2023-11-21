const val HAS_DAMAGE = false // Альт: true
const val MIN_CREW_NUMBER = 55 //
const val MAX_CREW_NUMBER = 70 // Альт: Только 70
const val NUMBER_PROVISIONS = 50 // Альт: 51 и больше
const val IS_GOOD_WEATHER = true // Альт: true

fun main() {

    val hasNowDamage: Boolean = readln().toBoolean()
    val nowCrewNumber: Int = readln().toInt()
    val nowProvisionsNumber: Int = readln().toInt()
    val isNowGoodWeather: Boolean = readln().toBoolean()

    println(
        "Возможность корабля отправиться в плавание: ${
            ((HAS_DAMAGE == hasNowDamage) && ((MIN_CREW_NUMBER <= nowCrewNumber) and (MAX_CREW_NUMBER >= nowCrewNumber)) && (NUMBER_PROVISIONS < nowProvisionsNumber))
                    || ((MAX_CREW_NUMBER == nowCrewNumber) && (NUMBER_PROVISIONS <= nowProvisionsNumber) && (IS_GOOD_WEATHER == isNowGoodWeather))
        }"
    )

}