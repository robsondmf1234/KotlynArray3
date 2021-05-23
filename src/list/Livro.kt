package list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editra: String? = null
)