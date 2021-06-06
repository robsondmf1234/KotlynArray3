package list

//Arquivo de demonstra o uso de List

fun main() {

    val livro1 = Livro(
        "Grande Sertão Veredas",
        "João Guimaraes Rosa",
        1956
    )
    val livro5 = Livro(
        "Java Use a cabeça",
        "Desonchecido",
        1975
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
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro5)

    livros.add(
        Livro(
            "O Iluminado",
            "Stephen",
            1990
        )
    )
    livros.imprimeComMarcadores()

    val ordenadoAnoPublicação: List<Livro> = livros.sorted()
    ordenadoAnoPublicação.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()
//    println(livros)
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros ####\n$textoFormatado")
}