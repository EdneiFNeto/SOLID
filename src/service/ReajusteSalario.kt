package service

import model.Funcionario
import java.math.BigDecimal

class ReajusteSalario() {

    private val validacoes = ArrayList<ValidacaoReajsute>()
    fun reajusteSalario(funcionario: Funcionario, aumento: BigDecimal){
        validacoes.forEach {
            it.validar(funcionario, aumento)
        }
        funcionario.atualizarSalario(funcionario.dadosPessoais.salario.add(aumento))
    }
}
