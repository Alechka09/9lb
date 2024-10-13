//Учитывая положительное целое число, n реализуйте функцию, которая
//возвращает список, представляющий форму generatePyramid с n
//уровнями. Функция должна консольно регистрировать форму
//generatePyramid с N уровнями, используя символ #. Убедитесь, что в
//generatePyramid есть пробелы как с левой, так и с правой стороны.
fun generatePyramid(n: Int) {
    for (i in 0 until n) {
        // Вычисляем количество пробелов и символов #
        val spaces = " ".repeat(n - i - 1)
        val hashes = "#".repeat(2 * i + 1)
        // Создаем строку для текущего уровня
        val level = spaces + hashes + spaces
        println(level)
    }
}
fun main() {
    generatePyramid(1)
    println()
    generatePyramid(2)
    println()
    generatePyramid(3)
}