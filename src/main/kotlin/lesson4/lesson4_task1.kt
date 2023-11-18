const val TABLE_AMOUNT_CONST = 13

fun main() {

    val tableReservationToday = TABLE_AMOUNT_CONST
    val tableReservationTomorrow = (TABLE_AMOUNT_CONST - 4)

    println(
        "Доступность столиков на сегодня: ${tableReservationToday < TABLE_AMOUNT_CONST}\n" +
                "Доступность столиков на завтра: ${tableReservationTomorrow < TABLE_AMOUNT_CONST}"
    )

}