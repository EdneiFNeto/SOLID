package service

import ValidacaoException
import model.Funcionario
import java.math.BigDecimal
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class ValidacaoPeriodicidadeEntreReajuste : ValidacaoReajsute{

    override fun validar(funcionario: Funcionario, aumento: BigDecimal){
        val ultimoReajuste = funcionario.dataUltimoReajuste
        var dataAtual = LocalDate.now()
        var between = ChronoUnit.MONTHS.between(funcionario.dataUltimoReajuste, dataAtual)
        if(between < 6){
            throw ValidacaoException("Intervalo entre reajuste deve ser minimo 6 meses!")
        }

    }
}
