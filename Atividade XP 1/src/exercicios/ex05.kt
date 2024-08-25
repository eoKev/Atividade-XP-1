package exercicios

import kotlin.random.Random

class ex05 {

    fun lancarDados() {
        print("Quantas vezes você deseja lançar os dados? ")
        val numLancamentos = readLine()?.toIntOrNull() ?: 1
        var somaTotal = 0

        repeat(numLancamentos) { i ->
            val dado1 = Random.nextInt(1, 7)
            val dado2 = Random.nextInt(1, 7)
            val soma = dado1 + dado2
            somaTotal += soma // Acumulando a soma total
            println("Lançamento ${i + 1}: Dado 1 = $dado1, Dado 2 = $dado2, Soma = $soma")
        }

        println("Soma total dos lançamentos: $somaTotal")
    }
}
