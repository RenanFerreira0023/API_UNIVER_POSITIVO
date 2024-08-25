package org.appsskilldeveloper.personagem.Racas

class RacaHumano : Raca {
    val NOME_RACA = "Humano"

    override fun nome_raca(): String {
        return this.NOME_RACA
    }

    override fun descobrir_bonus_por_raca(nomeAtributo : String): Int
    {
        return  1
    }


}