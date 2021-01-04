package service

import ValidacaoException
import model.Cargo
import model.Funcionario

class PromocaoService {
    fun promover(funcionario: Funcionario, metaBatida: Boolean){
        val cargoAtual = funcionario.dadosPessoais.cargo
        if(cargoAtual == Cargo.GERENTE)
            throw ValidacaoException("Gerente no pode ser promovidos")

        if(metaBatida){
            var novoCargo = cargoAtual.proximoCargo()
            funcionario.promover(novoCargo)
        }else{
            throw ValidacaoException("Funcionario nao pode ser promovido+")
        }
    }
}