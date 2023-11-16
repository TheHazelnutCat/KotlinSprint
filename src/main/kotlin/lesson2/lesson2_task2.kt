fun main() {

    val generalStaff = 50
    val traineeStaff = 30
    val salaryGeneral = 30_000
    val salaryTrainee = 20_000

    val paymentGeneral = generalStaff * salaryGeneral
    val paymentTrainee = traineeStaff * salaryTrainee
    val paymentAll = paymentGeneral + paymentTrainee
    val paymentAverage = paymentAll / (generalStaff + traineeStaff)

    println(paymentGeneral)
    println(paymentAll)
    println(paymentAverage)
}