package array

import list.Prateleira
import list.listaDeLivros
import utils.imprimeComMarcadores

fun main() {

    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAnoPublicaao = prateleira.organizarPorAnoPublicacao()
    val porAutor = prateleira.organizarPorAutor()

    //Esta sendo imprimida a mesma lista , pois prateleira vai apontar para a mesma lista que recebeu no parametro
    porAnoPublicaao.imprimeComMarcadores()
    porAutor.imprimeComMarcadores()



    //Maneira correta de imprimir a lista ordaneda
   // prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()
   // prateleira.organizarPorAutor().imprimeComMarcadores()
}