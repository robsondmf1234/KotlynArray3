package list

//Versão para atender as mudanças para trabalhar com List
data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }

}

//Versão antiga
/*

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    fun organizarPorAutor(): MutableList<Livro> {
        livros.sortBy { it.autor }
        return livros
    }

    fun organizarPorAnoPublicacao(): MutableList<Livro> {
        livros.sortBy { it.anoPublicacao }
        return livros
    }

}
*/