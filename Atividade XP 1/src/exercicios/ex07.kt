package exercicios

import java.util.*

class Voo(
    val numeroDoVoo: String,
    val assentosDisponiveis: MutableList<Int>
) {

    fun verificarDisponibilidade(assento: Int): Boolean {
        return assento in assentosDisponiveis
    }

    fun reservarAssento(assento: Int): Boolean {
        return if (verificarDisponibilidade(assento)) {
            assentosDisponiveis.remove(assento)
            true
        } else {
            false
        }
    }
}

class ex07 {

    fun iniciar() {
        val voo = Voo(
            numeroDoVoo = "0001",
            assentosDisponiveis = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        )

        while (true) {
            print("Digite o número do assento que deseja verificar e reservar (ou 'sair' para encerrar): ")
            val input = readLine()

            if (input.equals("sair", ignoreCase = true)) {
                break
            }

            val assento = input?.toIntOrNull()
            if (assento == null) {
                println("Número de assento inválido!")
                continue
            }

            if (voo.verificarDisponibilidade(assento)) {
                println("Assento $assento está disponível.")
                print("Deseja reservar este assento? (s/n): ")
                val resposta = readLine()?.trim()?.lowercase(Locale.getDefault())
                if (resposta == "s") {
                    if (voo.reservarAssento(assento)) {
                        println("Assento $assento reservado com sucesso.")
                    } else {
                        println("Falha ao reservar o assento $assento.")
                    }
                } else {
                    println("Reserva cancelada.")
                }
            } else {
                println("Assento $assento não está disponível.")
            }
        }
    }
}
