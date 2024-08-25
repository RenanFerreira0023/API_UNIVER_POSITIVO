package org.example.atributos

import org.appsskilldeveloper.personagem.Atributos.Atributos


class Destreza(var valorInput : Int) : Atributos {



    override fun recuperar_valor_input() : Int{
        return this.valorInput
    }

}