public fun utilizandoRanges() {
    //Range de 1 até 10
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println()

    //Range de 0 até 100 pulando de 2 em 2
    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println()

    //Percorrer série de numero de 0 até 100 pulando de 2 em 2
    //Until não irá incluir o numero 100
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

    //[in] Verifica se um valor está dentro, do intervalo de salários
    val intervaloDeSalarios = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervaloDeSalarios) {
        println("$salario - Está dentro do intervalo")
    } else {
        println("$salario - Não está dentro do intervalo")
    }

    //[in] consegue fazer a verificação de caracteres também
    val alfabeto = 'a'..'z'
    val letraBuscada = 'k'
    if (letraBuscada in alfabeto) {
        println("A letra '$letraBuscada' está dentro do alfabeto informado")
    } else {
        println("A letra $letraBuscada não está dentro do alfabeto informado")
    }
}
