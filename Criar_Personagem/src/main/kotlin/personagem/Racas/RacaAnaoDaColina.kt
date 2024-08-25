package org.appsskilldeveloper.personagem.Racas

class RacaAnaoDaColina : Raca {
    val NOME_RACA = "Anão da colina"

    override fun descobrir_bonus_por_raca(nomeAtributo: String): Int {
        if (nomeAtributo.equals("sabedoria", ignoreCase = true))
            return +1
        else
            return 0
    }

    override fun nome_raca(): String {
        return this.NOME_RACA
    }
}