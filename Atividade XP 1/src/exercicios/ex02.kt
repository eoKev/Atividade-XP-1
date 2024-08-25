package exercicios

class ex02 {

    fun contarPalavras() {
        println("Escreva um parágrafo: ")
        val paragraph = readLine()

        if (paragraph.isNullOrEmpty()) {
            println("Nenhum texto foi inserido.")
            return
        }

        val contador = paragraph.split("\\s+".toRegex()).size
        println("O parágrafo contém $contador palavras.")
    }
}
