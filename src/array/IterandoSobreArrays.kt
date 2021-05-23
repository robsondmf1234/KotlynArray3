public fun IterandoSobreArrays() {

    //Criando um array do tipo Double
    val salarios: DoubleArray = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)

    //Aumente de 10%
    val aumento = 1.1
    //Valor do indice
    var indice = 0

    //Iterando no Array
    for (salario in salarios) {
        //Iterando sobre o aray salarios incrementando o indice para mudar o indice a ser alterado
        salarios[indice] = salario * aumento
        indice++
    }
    println("Salarios com aumento: ${salarios.contentToString()}")

    //Outra forma de iterar no array, pegando o indice do Array de salarios
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    //Itrando no array pelo index , [indice , salario]
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}
