import exercicios.*

fun main() {
    while (true) {
        print(
            """
            Escolha um exercício para ser executado: 
            [1] - Exercício 01 
            [2] - Exercício 02 
            [3] - Exercício 03 
            [4] - Exercício 04 
            [5] - Exercício 05 
            [6] - Exercício 06
            [7] - Exercício 07
            [8] - Exercício 08 
            [0] - Sair
            Digite sua escolha: 
        """.trimIndent()
        )

        when (readLine()?.toIntOrNull()) {
            1 -> ex01().validar()
            2 -> ex02().contarPalavras()
            3 -> ex03().executar()
            4 -> ex04().ordenar()
            5 -> ex05().lancarDados()
            6 -> ex06().executar()
            7 -> ex07().iniciar()
            8 -> ex08().iniciar()
            0 -> {
                println("Saindo...")
                break
            }
            else -> println("Escolha inválida. Por favor, escolha entre 1 e 8, ou 0 para sair.")
        }
    }
}
