package list

//Arquivo de demonstra o uso de List

fun main() {

    val livro1 = Livro(
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
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3)

    livros.add(
        Livro(
            "O Iluminado",
            "Stephen",
            1990
        )
    )
    println(livros)
}