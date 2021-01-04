package model

import service.ReajusteSalario
import java.math.BigDecimal
import java.time.LocalDate

open class Funcionario(
    val dadosPessoais: DadosPessoais,
    var dataUltimoReajuste: LocalDate
){
    fun reajusteSalario(aumento: BigDecimal){
        ReajusteSalario().reajusteSalario(this, aumento)
    }

    fun atualizarSalario(novoSalario: BigDecimal) {
        this.dadosPessoais.salario = novoSalario
        this.dataUltimoReajuste = LocalDate.now()
    }

    fun promover(novoCargo: Cargo) {
        this.dadosPessoais.cargo = novoCargo
    }
}