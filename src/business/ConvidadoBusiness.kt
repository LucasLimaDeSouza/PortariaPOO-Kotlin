package business

import entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo" )

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun conviteValido(convite: Convidado) = when (convite.tipo)  {
            "comum" -> convite.codigo.startsWith("xt")
            "premium", "luxo" ->  convite.codigo.startsWith("xl")
            else -> false

    }
/*
    fun codigoValido(codigo: String, tipo: String): Boolean {
        if (tipo == "Premium" || tipo == "Luxo"  && codigo.startsWith("xl")) {
            return true
        } else {
            return false
            println("Negado. convite invalido")
        }
    }
    */

}