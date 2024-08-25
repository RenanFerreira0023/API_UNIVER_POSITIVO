package org.appsskilldeveloper.personagem.Racas

class RacaAnao : Raca {
    val NOME_RACA = "Anão"

    override fun descobrir_bonus_por_raca(nomeAtributo : String): Int {
        if(nomeAtributo.equals("constituicao", ignoreCase = true))
            return +2
        else
            return 0
    }

    override fun nome_raca(): String {
        return this.NOME_RACA
    }
}