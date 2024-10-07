//Генератор паролей: Реализуйте упражнение по генерации случайного
//пароля заданной длины, используя цифры, буквы и специальные
//символы
import kotlin.random.Random
fun generateRandomPassword(length: Int): String {
    // Символы, которые будут использоваться для генерации пароля
    val upperCaseLetters = ('A'..'Z').toList()
    val lowerCaseLetters = ('a'..'z').toList()
    val digits = ('0'..'9').toList()
    val specialCharacters = "!@#$%^&*()-_=+<>?[]{}|;:,".toList()
    // Объединяем все символы в один список
    val allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters
    // Генерируем пароль
    return (1..length)
        .map { allCharacters.random() }
        .joinToString("")
}
fun main() {
    println("Введите желаемую длину пароля:")
    val lengthInput = readLine()
    // Проверяем ввод и отслеживаем возможные ошибки
    val length = lengthInput?.toIntOrNull()
    if (length != null && length > 0) {
        val password = generateRandomPassword(length)
        println("Сгенерированный пароль: $password")
    } else {
        println("введите корректное число")
    }
}