package org.appsskilldeveloper.personagem.Racas

class RacaAnaoDaMontanha : Raca {
    val NOME_RACA = "Anão da montanha"

    override fun nome_raca(): String {
        return this.NOME_RACA
    }

    override fun descobrir_bonus_por_raca(nomeAtributo : String): Int {
        if(nomeAtributo.equals("forca", ignoreCase = true))
            return +2
        else
            return 0
    }

}