import java.util.Scanner

const val LONG_COND_SHIP_INTACT = true // Альт: false
const val LONG_COND_NUMBER_CREW_MIN = 55 //
const val LONG_COND_NUMBER_CREW_MAX = 70 // Альт: Только 70
const val LONG_COND_NUMBER_PROVISIONS = 51 // Альт: 51 и больше
const val LONG_COND_GOOD_WEATHER = true // Альт: true

fun main() {

    val readerInput = Scanner(System.`in`)
    val actualShipIntact: Boolean = readerInput.nextBoolean()
    val actualNumberCrew: Int = readerInput.nextInt()
    val actualNumberProvisions: Int = readerInput.nextInt()
    val actualGoodWeather: Boolean = readerInput.nextBoolean()

    println(
        "Возможность корабля отправиться в плавание: ${
            ((LONG_COND_SHIP_INTACT == actualShipIntact) && ((LONG_COND_NUMBER_CREW_MIN <= actualNumberCrew) and (LONG_COND_NUMBER_CREW_MAX >= actualNumberCrew)) && (LONG_COND_NUMBER_PROVISIONS <= actualNumberProvisions) && (LONG_COND_GOOD_WEATHER == actualGoodWeather))
                    || ((LONG_COND_SHIP_INTACT != actualShipIntact) && (LONG_COND_NUMBER_CREW_MAX == actualNumberCrew) && (LONG_COND_NUMBER_PROVISIONS <= actualNumberProvisions) && (LONG_COND_GOOD_WEATHER == actualGoodWeather))
        }"
    )

}