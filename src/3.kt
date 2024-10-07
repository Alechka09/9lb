//Конвертер валют: Реализуйте программу, которая конвертирует одну
//валюту в другую (например, доллар в евро)
fun main() {
    val e = mapOf(
        "USD" to 95.0,
        "EUR" to 105.0
    )
    println("Введите сумму и валюту :")
    val i = readLine() ?: return
    val p = i.split(" ")
    if (p.size != 2) {
        println("Ведите валюту и сумму")
        return
    }
    val a = p[0].toDoubleOrNull()
    val c = p[1].toUpperCase()

    if (a == null || !e.containsKey(c)) {
        println("Неверная сумма или валюта")
        return
    }
    println("Введите валюту (USD, EUR):")
    val b = readLine()?.toUpperCase()

    if (b == null || !e.containsKey(b)) {
        println("Неверная валюта для конвертации")
        return
    }
    // Конвертация
    val y = a * (e[b]!! / e[c]!!)
    println("$a $c = %.2f $b".format(y))
}