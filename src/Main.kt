//Генератор случайных чисел: Напишите программу, которая генерирует
//и выводит 10 случайных чисел от 1 до 100.
import kotlin.random.Random
fun main() {
    // Создаем экземпляр генератора случайных чисел
    val r = Random

    for (n in 1..10) {
        val randomNumber = r.nextInt(1, 101) // Генерация числа от 1 до 100
        println(randomNumber)
    }
}