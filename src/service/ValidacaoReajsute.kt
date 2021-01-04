package service

import model.Funcionario
import java.math.BigDecimal

interface ValidacaoReajsute {
    fun validar(funcionario: Funcionario, aumento: BigDecimal)
}
