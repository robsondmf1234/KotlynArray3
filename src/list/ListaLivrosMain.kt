package list

//Arquivo de demonstra o uso de List

fun main() {

    //Filtrando a lista pelo nome do autor e ordenando pelo ano de publicação
    listaDeLivros
        .filter { it.autor == "João Guimaraes Rosa" }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    //Filtrando a lista pela letra inicial do autor
    listaDeLivros
        .filter { it.autor.startsWith("João") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    //Filtrando a lista pela letra inicial do autor
    // e pegando essa lista de titulos e transformando em uma lista de titulos
    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)

    //Código comentado
    /*val livro1 = Livro(
        "Grande Sertão Veredas",
        "João Guimaraes Rosa",
        1956
    )
    val livro2 = Livro(
        "Harry Potter",
        "Rowling",
        2000
    )

    val livro3 = Livro(
        "Senhor dos aneis",
        "Tolkien",
        1960,
        "Abril"
    )

    val livro4 = Livro(
        "Java Use a cabeça",
        "Desonchecido",
        1975
    )

    val livro5 = Livro(
        "Barça 1",
        "Tulio",
        2011
    )
    val livro6 = Livro(
        "Google",
        "Bryan",
        2011
    )

    val livro7 = Livro(
        "C# Livro",
        "Edsion",
        1980,
        "Leia"
    )

    val livro8 = Livro(
        "Arduino",
        "Sandra Hirushy",
        1999
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro5, livro4, livro6,livro7,livro8)

    livros.add(
        Livro(
            "O Iluminado",
            "Stephen",
            1990
        )
    )
    livros.imprimeComMarcadores()

    //Recebendo umalista ordenada pelo metodo sorted que está implementao na classe Livro
    val ordenadoAnoPublicação: List<Livro> = livros.sorted()
    ordenadoAnoPublicação.imprimeComMarcadores()

    //Implementando sortedBY por titulo
    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    //IMplementando sortedBY por autor
    livros.sortedBy { it.autor }.imprimeComMarcadores()
//    println(livros)*/
}

//Extension Function para imrpimir a lista de forma mais organizada
fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros ####\n$textoFormatado")
}