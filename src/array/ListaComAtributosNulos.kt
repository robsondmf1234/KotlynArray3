package array

import list.Livro
import list.listaDeLivros

fun main() {

    //Função para agrupar os livros de acordo com sua editora
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida." }
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }

}