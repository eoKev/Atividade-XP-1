package exercicios

class ex03 {

    class Aluno(val nome: String, val notas: DoubleArray) {
        fun calcularMedia(): Double {
            return notas.average()
        }

        fun verificarAprovacao(): Boolean {
            return calcularMedia() >= 7.0
        }

        fun exibirResultado() {
            val media = calcularMedia()
            val status = if (verificarAprovacao()) "Aprovado" else "Reprovado"
            println("Aluno: $nome | Média: %.2f | Status: $status".format(media))
        }
    }

    fun executar() {
        val alunos = mutableListOf<Aluno>()

        for (i in 1..5) {
            println("Cadastro do aluno $i:")
            print("Digite o nome do aluno: ")
            val nome = readLine() ?: ""

            val notas = DoubleArray(4)
            for (j in 0 until 4) {
                print("Digite a nota ${j + 1}: ")
                notas[j] = readLine()?.toDoubleOrNull() ?: 0.0
            }

            alunos.add(Aluno(nome, notas))
        }

        println("\nResultados:")
        alunos.forEach { it.exibirResultado() }
    }
}
