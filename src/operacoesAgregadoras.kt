fun operacoesAgregadoras() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    //Atribuindo a maior idade na variavel a ser comparada
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    //Atribuindo a menor idade na variavel a ser comparada
    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    //Armazenando a média das idades
    val media: Double = idades.average()
    println("Média das idades: $media")

    //Verificando se todas as idades são maiores que 18
    val todosMaiores18: Boolean = idades.all { it >= 18 }
    println("Todos maiores que 18 ? $todosMaiores18")

    //Verificando se algum aluno possui mais de 18 anos
    val existeMaiorIdade: Boolean = idades.any { it >= 18 }
    println("Existe aluno maior que 18 anos ? $existeMaiorIdade")

    //Filtra a lista com alunos maior/igual de 18
    val listaDeMaioresDe18 = idades.filter { it >= 18 }
    println("Maiores de 18:$listaDeMaioresDe18")

    //Filtra a lista com alunos menores de 18 anos
    val listaDeMenoresDe18 = idades.filter { it < 18 }
    println("Menores de 18:$listaDeMenoresDe18")

    val encontraALunoComIdadeEspecifica = idades.find { it == 40 }
    println("Aluno com 40 anos: $encontraALunoComIdadeEspecifica")
}
