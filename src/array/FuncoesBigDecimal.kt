import java.math.BigDecimal

//Função para criar um Array<BigDecimal>, receberá um vararg como paramentro dos salários
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    //[nome do array] = [ <declaração de BigDecimal> ] [ (tamanho do array)] { [indice ->
    //[ pega a variavel no indicie[indice] ]. tranforma para BigDecimal
    val salarios = Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
    return salarios
}

//This é o próprio array<BigDecimal>
//Reduce
//Sintaxe reduce { acc, bigDecimal ->  }
//acc = acumulador , e o valor que vai ficar armazenando os valores que vierem do array de BigDecimal
//bigDecimal e o valor no indice do array de BigDecimal
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        return BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}