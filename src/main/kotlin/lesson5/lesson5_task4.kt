fun main() {

    val textIntro =
        "Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля\n\"Heart of Gold\". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя,\nчтобы мы могли приступить к процессу входа. Я всегда готов служить,\nхотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.\n[вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..."
    val authUserLogin = "Zaphod"
    val authUserPass = "PanGalactic"

    println("$textIntro\nВведите имя пользователя:")

    val inputUserLogin: String
    val inputUserPass: String

    inputUserLogin = readln()

    if (inputUserLogin != authUserLogin) {
        println("Вы не зарегистрированы, введите пароль для регистрации:")
        inputUserPass = readln()
    } else {
        println("Введите пароль:")
        inputUserPass = readln()
        if (inputUserPass != authUserPass) {
            println("Пароль неверный!")
        } else {
            println("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь $authUserLogin,\nвам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно...\nНу вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...]\nНадеюсь, вам понравится пребывание здесь больше, чем мне.")

        }
    }

}