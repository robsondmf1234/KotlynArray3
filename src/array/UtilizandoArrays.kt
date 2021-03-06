fun utilizandoArrays() {

    //Utilizando Arrays, com valores de indexes pré definidos
    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 45

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("Maior idade: ${maiorIdade}")

    // [array].forEach , forEach é um outra forma de iterar sobre um array
    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println("Menor idade: ${menorIdade}")


    //Outra forma de declarar um array de Int,
    // com valores de arrays definido pela quantidade de parametros passados na declaração
    val idades2: IntArray = intArrayOf(25, 19, 33, 20, 20, 55)

    var maiorIdadeIntArray = Int.MIN_VALUE
    for (idade in idades2) {
        if (idade > maiorIdadeIntArray) {
            maiorIdadeIntArray = idade
        }
    }
    println("Maior idade: ${maiorIdadeIntArray}")
}

