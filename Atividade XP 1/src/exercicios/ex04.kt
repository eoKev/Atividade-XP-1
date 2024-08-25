package exercicios

class ex04 {

    fun ordenar() {
        val alunos = Array(10) { "" }

        for (i in alunos.indices) {
            print("Digite o nome do aluno ${i + 1}: ")
            alunos[i] = readLine() ?: ""
        }

        alunos.sort()

        println("\nLista de alunos em ordem alfabética:")
        alunos.forEach { println(it) }
    }
}
