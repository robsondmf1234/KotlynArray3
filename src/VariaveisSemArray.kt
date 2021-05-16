fun varivaeisSemArray() {

    //Método sem utilizar Array
    val idade1 = 25
    val idade2 = 20
    val idade3 = 33

    //Comparando as idades
    val maiorIdade = if (idade1 > idade2 && idade1 > idade3) {
        idade1
    } else if (idade2 > idade3) {
        idade2
    } else {
        idade3
    }

    println("Maior idade: ${maiorIdade}")
}