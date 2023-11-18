const val COND_SUN_STATUS: Boolean = true
const val COND_AWNING_STATUS: Boolean = true
const val COND_HUMIDITY: Int = 20
const val COND_UN_SEASON: String = "зима"

fun main() {

    val nowSunStatus: Boolean = true
    val nowAwningStatus: Boolean = true
    val nowHumidity: Int = 20
    val nowSeason: String = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${(COND_SUN_STATUS == nowSunStatus) && (COND_AWNING_STATUS == nowAwningStatus) && (COND_HUMIDITY == nowHumidity) && (COND_UN_SEASON != nowSeason)}"
    )
}