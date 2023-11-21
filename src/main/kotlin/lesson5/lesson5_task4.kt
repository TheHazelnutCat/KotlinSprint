const val AUTH_USER_LOGIN = "Zaphod"
const val AUTH_USER_PASS = "PanGalactic"

const val TEXT_INTRO =
    "Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля" +
            "\n\"Heart of Gold\". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя," +
            "\nчтобы мы могли приступить к процессу входа. Я всегда готов служить," +
            "\nхотя это не приносит мне радости... но вы, наверное, об этом не заботитесь." +
            "\n[вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..."
const val TEXT_SUCCESS =
    "[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь $AUTH_USER_LOGIN," +
            "\nвам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно..." +
            "\nНу вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...]" +
            "\nНадеюсь, вам понравится пребывание здесь больше, чем мне."

fun main() {

    val inputUserLogin: String
    val inputUserPass: String

    println("$TEXT_INTRO\nВведите имя пользователя:")
    inputUserLogin = readln()

    if (inputUserLogin != AUTH_USER_LOGIN) {
        println("Вы не зарегистрированы, введите пароль для регистрации:")
        inputUserPass = readln()
    } else {
        println("Введите пароль:")
        inputUserPass = readln()
        if (inputUserPass != AUTH_USER_PASS) {
            println("Пароль неверный!")
        } else {
            println(TEXT_SUCCESS)
        }
    }
}