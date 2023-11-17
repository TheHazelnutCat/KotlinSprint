import java.util.Scanner

fun main() {

    val longCondShipIntact = true // Альт: Необязательно
    val longCondNumberCrew = 55..70 // Альт: Только 70
    val longCondNumberProvisions = 51 // Альт: 51 и больше
    val longCondGoodWeather = true // Альт: обязательно

    val readerInput = Scanner(System.`in`)

    val actualShipIntact: Boolean = readerInput.nextBoolean()
    val actualNumberCrew: Int = readerInput.nextInt()
    val actualNumberProvisions: Int = readerInput.nextInt()
    val actualGoodWeather: Boolean = readerInput.nextBoolean()

    println(
        "Возможность корабля отправиться в плавание: ${
            ((longCondShipIntact == actualShipIntact) && (actualNumberCrew in longCondNumberCrew) && (longCondNumberProvisions <= actualNumberProvisions) && (longCondGoodWeather == actualGoodWeather))
                    || ((longCondShipIntact != actualShipIntact) && (longCondNumberCrew.max() == actualNumberCrew) && (longCondNumberProvisions <= actualNumberProvisions) && (longCondGoodWeather == actualGoodWeather))
        }"
    )

}