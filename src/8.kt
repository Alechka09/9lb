//Игра "Угадай число": Напишите консольную игру, в которой
//пользователь должен угадать случайное число от 1 до 100, а программа
//подсказывает, больше или меньше загаданное число.
import kotlin.random.Random
fun main(){
    val randomNumber = Random.nextInt(1, 101)
    var userGuess: Int? = null
    println("Угадай число!")
    println("угадайте мое число от 1 - 100")
    // Цикл для продолжения игры, пока пользователь не угадает число
    while (userGuess != randomNumber) {
        println("Введите ваше предположение: ")
        userGuess = readLine()?.toIntOrNull()  // Читаем ввод пользователя и проверяем на число

        if (userGuess == null) {
            println("введите корректное число")
            continue  // Если ввод некорректный, пропускаем итерацию
        }
        when {
            userGuess < randomNumber -> println("Загаданное число больше")
            userGuess > randomNumber -> println("Загаданное число меньше")
            else -> println("Вы угадали число $randomNumber")
        }
    }
}