package org.appsskilldeveloper.personagem.Racas

class RacaHalflingRobusto : Raca {
    val NOME_RACA = "Halfling robusto"

    override fun descobrir_bonus_por_raca(nomeAtributo: String): Int {
        if (nomeAtributo.equals("constituicao", ignoreCase = true))
            return +1
        else
            return 0
    }

    override fun nome_raca(): String {
        return this.NOME_RACA
    }
}