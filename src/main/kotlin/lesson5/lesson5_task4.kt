fun main() {

    val textIntro =
        "Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..."
    val authUserLogin = "Zaphod"
    val authUserPass = "PanGalactic"

    println("$textIntro\nВведите имя пользователя:")

    val inputUserLogin: String
    val inputUserPass: String

    inputUserLogin = readLine()!!

    if (inputUserLogin != authUserLogin) {
        println("Вы не зарегистрированы, введите пароль для регистрации:")
        inputUserPass = readLine()!!
    } else {
        println("Введите пароль:")
        inputUserPass = readLine()!!
        if (inputUserPass != authUserPass) {
            println("Пароль неверный!")
        } else {
            println("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь $authUserLogin, вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.")

        }
    }

}