fun main() {
    val averageWeightMax = 100
    val averageWeightMin = 35
    val averageVolume = 100

    val loadFirstWeight = 42
    val loadFirstVolume = 120
    val loadSecondWeight = 50
    val loadSecondVolume = 100


    println(
        "Груз с весом $loadFirstWeight кг и объемом $loadFirstVolume л соответствует категории 'Average': " +
                "${((loadFirstWeight >= averageWeightMin) && (loadFirstWeight <= averageWeightMax)) && (loadFirstVolume < averageVolume)}\n" +
                "Груз с весом $loadSecondWeight кг и объемом $loadSecondVolume л соответствует категории 'Average': " +
                "${((loadSecondWeight >= averageWeightMin) && (loadSecondWeight <= averageWeightMax)) && (loadSecondVolume < averageVolume)}"
    )
}