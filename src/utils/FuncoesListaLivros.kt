package utils

import list.Livro

//Extension Function para imrpimir a lista de forma mais organizada
//Filrando as listas para eliminar os elementos null
fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }
    println(" #### Lista de Livros ####\n$textoFormatado")
}

//Versão antiga
//Extension Function para imrpimir a lista de forma mais organizada
/*
fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros ####\n$textoFormatado")
}
 */