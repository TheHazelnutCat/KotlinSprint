fun main() {

    val condSunStatus: Boolean = true
    val condAwningStatus: Boolean = true
    val condHumidity: Int = 20
    val condUnSeason: String = "зима"

    val nowSunStatus: Boolean = true
    val nowAwningStatus: Boolean = true
    val nowHumidity: Int = 20
    val nowSeason: String = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${(condSunStatus == nowSunStatus) && (condAwningStatus == nowAwningStatus) && (condHumidity == nowHumidity) && (condUnSeason != nowSeason)}"
    )
}