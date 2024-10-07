//Нахождение простых чисел: Реализуйте программу, которая находит и
//выводит все простые числа до заданного числа N
fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}
fun findPrimesUpToN(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    for (i in 2..n) {
        if (isPrime(i)) {
            primes.add(i)
        }
    }
    return primes
}
fun main() {
    println("Введите число N: ")
    val input = readLine()
    val n = input?.toIntOrNull()

    if (n != null && n > 0) {
        val primes = findPrimesUpToN(n)
        println("Простые числа до $n: $primes")
    }
}
