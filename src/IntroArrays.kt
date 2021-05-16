import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
//setScale serve para especificar quantas casa aparecem após a virgula
//RoundingMode.UP arredondamento para cima
//sintaxe setScale(quantidade casas após virgula , método de arredondamento)

    //Maneira mais simples dedeclara o Array<BigDecimal>
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())


    val aumento = "1.1".toBigDecimal()
    //Função map ,vai pegar os dados e transforma para outro tipo
    //pega o salario(salarios) aplica o aumento , no final monta um salarioComAumentod do tipo Array<BigDecimal>
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            if (salario < "5000.00".toBigDecimal()) {
                salario + "500.00".toBigDecimal().setScale(2, RoundingMode.UP)
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()
    println(salariosComAumento.contentToString())

//Maneira mais longa de fazer o Array<BigDecimal>
//    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    salarios[0] = "1500.55".toBigDecimal()
//    salarios[1] = "2000.55".toBigDecimal()


    operacoesAgregadoras()
    //utilizandoRanges()
    //IterandoSobreArrays()
    //utilizandoArrays()
    //varivaeisSemArray()
}

//Função para criar um Array<BigDecimal>, receberá um vararg como paramentro dos salários
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    val salarios = Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
    return salarios
}


