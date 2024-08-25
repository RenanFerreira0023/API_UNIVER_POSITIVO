package org.appsskilldeveloper.personagem.Racas

class RacaTiefling : Raca {
    val NOME_RACA = "Tiefling"


    override fun descobrir_bonus_por_raca(nomeAtributo: String): Int {
        if (nomeAtributo.equals("inteligencia", ignoreCase = true))
            return +1
        else
            if (nomeAtributo.equals("carisma", ignoreCase = true))
                return +2
            else
                return 0
    }

    override fun nome_raca(): String {
        return this.NOME_RACA
    }
}