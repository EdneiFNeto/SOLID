package model

import java.math.BigDecimal

class DadosPessoais(
    var nome: String,
    var cpf: String,
    var cargo: Cargo,
    var salario: BigDecimal
)