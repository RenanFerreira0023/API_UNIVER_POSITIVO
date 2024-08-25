package org.appsskilldeveloper.personagem.Racas

class RacaGnomoDasRochas : Raca {
    val NOME_RACA = "Gnomo das rochas"

    override fun descobrir_bonus_por_raca(nomeAtributo: String): Int {
        if (nomeAtributo.equals("destreza", ignoreCase = true))
            return +1
        else
            return 0
    }

    override fun nome_raca(): String {
        return this.NOME_RACA
    }
}