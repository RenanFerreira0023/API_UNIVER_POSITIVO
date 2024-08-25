package org.appsskilldeveloper.personagem.Racas

class RacaGnomoDaFloresta : Raca {
    val NOME_RACA = "Gnomo da floresta"

    override fun descobrir_bonus_por_raca(nomeAtributo: String): Int {
        if (nomeAtributo.equals("destreza", ignoreCase = true))
            return +2
        else
            return 0
    }

    override fun nome_raca(): String {
        return this.NOME_RACA
    }
}