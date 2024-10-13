//Написать программу, реализующую Шифр цезаря
fun main() {
    val text = "альбина я!"
    val shift = 3
    val encryptedText = caesarCipher(text, shift)
    println("Зашифрованный текст: $encryptedText")
    val decryptedText = caesarCipher(encryptedText, -shift)
    println("Расшифрованный текст: $decryptedText")
}
fun caesarCipher(input: String, shift: Int): String {
    val result = StringBuilder()

    for (char in input) {
        // Проверяем, является ли символ буквой кириллицы
        when {
            char in 'А'..'Я' -> {
                val shiftedChar = (char + shift).toChar()
                // Если смещение превышает пределы алфавита, восстанавливаем его
                result.append(if (shiftedChar > 'Я') (shiftedChar - 32) else shiftedChar)
            }
            char in 'а'..'я' -> {
                val shiftedChar = (char + shift).toChar()
                // Если смещение превышает пределы алфавита, восстанавливаем его
                result.append(if (shiftedChar > 'я') (shiftedChar - 32) else shiftedChar)
            }
            else -> result.append(char) // Оставляем остальные символы без изменений
        }
    }

    return result.toString()
}