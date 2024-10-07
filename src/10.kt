//По заданной строке реализуйте функцию, которая возвращает самое
//длинное слово в этой строке. Если есть два или более слов одинаковой
//длины, верните первое самое длинное слово из строки. Игнорируйте
//знаки препинания. Входная строка не может быть пустой или
//незаполненным отображением.
fun findLongestWord(input: String): String {
    // Удаляем знаки препинания с помощью регулярного выражения
    val cleanedInput = input.replace(Regex("[^\\w\\s]"), "")
    // Разбиваем строку на слова
    val words = cleanedInput.split("\\s+".toRegex())
    return words.maxByOrNull { it.length } ?: "" // Находим самое длинное слово
}
fun main() {
    println("Введите строку:")
    val input = readLine()
    if (!input.isNullOrBlank()) {
        val longestWord = findLongestWord(input)
        println("Самое длинное слово: \"$longestWord\"")
    }
}