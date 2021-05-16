public fun IterandoSobreArrays() {
    val salarios: DoubleArray = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    var indice = 0

    //Iterando no Array
    for (salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }
    println("Salarios com aumento: ${salarios.contentToString()}")

    //Outra forma de iterar no array, pegando o indice do Array de salarios
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    //Itrando no array pelo index
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}
