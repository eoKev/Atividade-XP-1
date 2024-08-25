package exercicios

class Produto(
    val nome: String,
    var quantidade: Int,
    val nivelMinimo: Int,
    val nivelMaximo: Int
) {
    fun reporEstoque() {
        println("Repondo o estoque do produto: $nome")
        quantidade = nivelMaximo
        println("Estoque de $nome reabastecido para $quantidade unidades.")
    }

    fun verificarEstoque() {
        println("Verificando estoque do produto: $nome")
        if (quantidade < nivelMinimo) {
            println("A quantidade de $nome está abaixo do nível mínimo. Necessário repor.")
            reporEstoque()
        } else {
            println("A quantidade de $nome está acima do mínimo:" +
                    " $quantidade unidades.")
        }
    }
}

class ex08 {

    fun iniciar() {
        val produtos = mutableListOf<Produto>()

        for (i in 1..5) {
            print("Digite o nome do produto $i: ")
            val nome = readLine().orEmpty()
            print("Digite a quantidade atual do produto $i: ")
            val quantidade = readLine()?.toIntOrNull() ?: 0
            print("Digite o nível mínimo do produto $i: ")
            val nivelMinimo = readLine()?.toIntOrNull() ?: 0
            print("Digite o nível máximo do produto $i: ")
            val nivelMaximo = readLine()?.toIntOrNull() ?: 0
            val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
            produtos.add(produto)
        }

        for (produto in produtos) {
            produto.verificarEstoque()
        }
    }
}
