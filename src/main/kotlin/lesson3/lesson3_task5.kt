fun main() {
    val moveData = "D2-D4;0"

    val moveFrom = "${moveData[0]}${moveData[1]}"
    val moveTo = "${moveData[3]}${moveData[4]}"
    val moveNumber = moveData.substring(6)

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}