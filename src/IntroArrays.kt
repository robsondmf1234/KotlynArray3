import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
//setScale serve para especificar quantas casa aparecem após a virgula
//RoundingMode.UP arredondamento para cima
//sintaxe setScale(quantidade casas após virgula , método de arredondamento)

// Maneira mais longa de fazer o Array<BigDecimal>
//    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    salarios[0] = "1500.55".toBigDecimal()
//    salarios[1] = "2000.55".toBigDecimal()

    //Maneira mais simples dedeclara o Array<BigDecimal>
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    //Função map ,vai pegar os dados e transforma para outro tipo
    //pega o salario(salarios) aplica o aumento , no final monta um salarioComAumentod do tipo Array<BigDecimal>
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto Inicial: $gastoInicial")

    //Fold
    //sntaxe bigDecimal.fold(valorInicial){acumulador,salario ->
    //acumulador valor que vai ficar armazenando a soma
    //salario-> e o valor no indice do array de BigDecimal(salariosComAUmento)
    //Funcinamento: fold vai pegar o valor inicial , vai calcular o salario vezes a quantidade de meses e armazenar no acumulador,
    //quando os indices do bigDecimal terminar, vai retornar o valor total dessa soma
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)



    //operacoesAgregadoras()
    //utilizandoRanges()
    //IterandoSobreArrays()
    //utilizandoArrays()
    //varivaeisSemArray()
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal().setScale(2, RoundingMode.UP)
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }


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

