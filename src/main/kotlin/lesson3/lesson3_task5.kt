fun main() {
    val moveData = "D2-D4;0"
    val moveDataSplit = moveData.split("-", ";")

    val moveFrom = moveDataSplit[0]
    val moveTo = moveDataSplit[1]
    val moveNumber = moveDataSplit[2]

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}