public fun utilizandoRanges() {
    //Range de 1 até 10
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println()

    //Range de 0 até 100 pulando de 2 em 2
    val numerosPares = 0..100 step 2
    for (num in numerosPares) {
        print("$num ")
    }

    println()

    //Percorrer série de numero de 0 até 100 pulando de 2 em 2
    val numerosPares2 = 0 until 100 step 2
    for (num in numerosPares2) {
        print("$num ")
    }
    println()


    //Percorrer série de numero de 100 até 0 ,pulando de 2 em 2
    val numerosParesRegressivos = 100 downTo 0 step 2
    numerosParesRegressivos.forEach {
        print("$it ")
    }

    println()

    //Verificado se um valor esta dentro do intervalo de salários
    val intervaloDeSalarios = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervaloDeSalarios) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val intervaloDeLetras = 'a'..'z'
    val letraBuscada = 'k'
    if (letraBuscada in intervaloDeLetras) {
        println("A letra possui no intervalo de letras")
    } else {
        println("A letra não possui no intervalo de letras")
    }
}
