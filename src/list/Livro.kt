package list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editra: String? = null
) : Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}