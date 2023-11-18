import kotlin.math.pow

fun main() {

    val valueInput = 70_000
    val valuePercent: Double = 16.7
    val valueTimeYears = 20

    val valueOutSum: Double = valueInput * (1 + valuePercent / 100).pow(valueTimeYears)
    println("%.3f".format(valueOutSum))

}