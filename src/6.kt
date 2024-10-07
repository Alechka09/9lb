//Сортировка строк: Напишите функцию, которая принимает массив
//строк и сортирует его по алфавиту.
fun sortStringsAlphabetically(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}
fun main() {
    val strings = arrayOf("katya", "albina", "oleg", "sema")
    val sortedStrings = sortStringsAlphabetically(strings)
    println("Отсортированные строки: ")
    sortedStrings.forEach { println(it) }
}