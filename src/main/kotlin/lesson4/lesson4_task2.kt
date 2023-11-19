const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_VOLUME = 100

fun main() {

    val loadFirstWeight = 42
    val loadFirstVolume = 120
    val loadSecondWeight = 50
    val loadSecondVolume = 100


    println(
        "Груз с весом $loadFirstWeight кг и объемом $loadFirstVolume л соответствует категории 'Average': " +
                "${((loadFirstWeight >= AVERAGE_WEIGHT_MIN) && (loadFirstWeight <= AVERAGE_WEIGHT_MAX)) && (loadFirstVolume < AVERAGE_VOLUME)}\n" +
                "Груз с весом $loadSecondWeight кг и объемом $loadSecondVolume л соответствует категории 'Average': " +
                "${((loadSecondWeight >= AVERAGE_WEIGHT_MIN) && (loadSecondWeight <= AVERAGE_WEIGHT_MAX)) && (loadSecondVolume < AVERAGE_VOLUME)}"
    )
}