package org.appsskilldeveloper.personagem.Racas

class RacaAltoElfo : Raca {
    val NOME_RACA = "Alto-elfo"


    override fun descobrir_bonus_por_raca(nomeAtributo : String): Int {
        if(nomeAtributo.equals("inteligencia", ignoreCase = true))
            return +1
        else
            return 0
    }

    override fun nome_raca(): String {
        return this.NOME_RACA
    }
}