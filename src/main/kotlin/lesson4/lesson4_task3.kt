const val IS_SUNNY_WEATHER: Boolean = true
const val IS_AWNING_OPEN: Boolean = true
const val HUMIDITY: Int = 20
const val UN_SEASON: String = "зима"

fun main() {

    val isNowSunnyWeather: Boolean = true
    val isNowAwningOpen: Boolean = true
    val nowHumidity: Int = 20
    val nowSeason: String = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${(IS_SUNNY_WEATHER == isNowSunnyWeather) && (IS_AWNING_OPEN == isNowAwningOpen) && (HUMIDITY == nowHumidity) && (UN_SEASON != nowSeason)}"
    )
}