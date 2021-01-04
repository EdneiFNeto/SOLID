package service

import ValidacaoException
import model.Funcionario
import java.math.BigDecimal
import java.math.RoundingMode

class ValidacaoPercentualReajuste: ValidacaoReajsute {

    override fun validar(funcionario: Funcionario, aumento: BigDecimal){
        val salarioAtual = funcionario.dadosPessoais.salario
        var precentual = aumento.divide(salarioAtual, RoundingMode.HALF_UP)
        if(precentual > BigDecimal("0.4")){
            throw ValidacaoException("Reajuste não pode ser superior a 40%")
        }
    }
}
