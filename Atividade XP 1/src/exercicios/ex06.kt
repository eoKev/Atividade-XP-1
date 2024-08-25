package exercicios

class ex06 {

    fun executar() {
        val temperaturas = DoubleArray(30)

        for (i in temperaturas.indices) {
            print("Digite a temperatura do dia ${i + 1}: ")
            temperaturas[i] = readLine()?.toDoubleOrNull() ?: 0.0
        }

        val mediaTemperatura = temperaturas.average()
        val temperaturaMaxima = temperaturas.maxOrNull() ?: 0.0
        val temperaturaMinima = temperaturas.minOrNull() ?: 0.0
        val diasMaxima = temperaturas.indices.filter { temperaturas[it] == temperaturaMaxima }
        val diasMinima = temperaturas.indices.filter { temperaturas[it] == temperaturaMinima }

        println("\nTemperatura média do mês: %.2f".format(mediaTemperatura))
        println("Temperatura máxima do mês: %.2f".format(temperaturaMaxima))
        println("Temperatura mínima do mês: %.2f".format(temperaturaMinima))
        println("Dias com a temperatura máxima (${temperaturaMaxima}): ${diasMaxima.map { it + 1 }}")
        println("Dias com a temperatura mínima (${temperaturaMinima}): ${diasMinima.map { it + 1 }}")
    }
}
