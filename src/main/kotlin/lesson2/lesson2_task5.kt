import kotlin.math.pow

fun main() {

    var valueInput = 70_000
    var valuePercent: Double = 16.7
    var valueTimeYears = 20

    var valueOutSum: Double = valueInput * (1 + valuePercent / 100).pow(valueTimeYears)
    println("%.3f".format(valueOutSum))

}