//Проверка на анаграмму: Напишите функцию, которая проверяет,
//являются ли две строки анаграммами.
fun main() {
    println("Введите первую строку:")
    val firstString = readLine() ?: return
    println("Введите вторую строку:")
    val secondString = readLine() ?: return

    if (areAnagrams(firstString, secondString)) {
        println("Строки являются анаграммами")
    } else {
        println("Строки не являются анаграммами")
    }
}
fun areAnagrams(str1: String, str2: String): Boolean {
    // Удаляем пробелы и приводим к нижнему регистру
    val cleanedStr1 = str1.replace("\\s".toRegex(), "").lowercase()
    val cleanedStr2 = str2.replace("\\s".toRegex(), "").lowercase()

    if (cleanedStr1.length != cleanedStr2.length) {  // Проверяем длину строк
        return false
    }
    // Сортируем символы и сравниваем
    return cleanedStr1.toCharArray().sortedArray().contentEquals(cleanedStr2.toCharArray().sortedArray())
}