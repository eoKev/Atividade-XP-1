package exercicios

class ex01 {

    fun validar() {
        print("Digite um número inteiro: ")
        val num = readLine()?.toIntOrNull()

        if (num == null) {
            println("Insira um número válido!")
            return
        }

        if (ePrimo(num)) {
            println("O número $num é primo.")
        } else {
            println("O número $num não é primo.")
        }
    }

    private fun ePrimo(num: Int): Boolean {
        if (num <= 1) return false
        if (num == 2 || num == 3) return true
        if (num % 2 == 0 || num % 3 == 0) return false

        var i = 5
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) return false
            i += 6
        }
        return true
    }
}
