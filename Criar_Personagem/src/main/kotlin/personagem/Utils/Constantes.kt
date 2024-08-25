package org.appsskilldeveloper.personagem.Utils

import java.util.*

open class Constantes {

    private val GLOBAL_TABELA_CUSTOS: Map<Int, Int> = mapOf(
        8 to 0,
        9 to 1,
        10 to 2,
        11 to 3,
        12 to 4,
        13 to 5,
        14 to 7,
        15 to 9
    )

    fun filtro_input_custos(valorCusto: Int): Int {
        if (valorCusto < 8) {
            println("Custo menor que o mínimo permitido, portanto será setado [ 8 ]")
            return 8
        }
        if (valorCusto > 15) {
            println("Custo maior que o máximo permitido, portanto será setado [ 15 ]")
            return 15
        }
        return valorCusto
    }



    fun descobrir_custo_de_habilidade(checkHash: Int): Int {
        return when (checkHash) {
            8 -> GLOBAL_TABELA_CUSTOS[8] ?: 0
            9 -> GLOBAL_TABELA_CUSTOS[9] ?: 0
            10 -> GLOBAL_TABELA_CUSTOS[10] ?: 0
            11 -> GLOBAL_TABELA_CUSTOS[11] ?: 0
            12 -> GLOBAL_TABELA_CUSTOS[12] ?: 0
            13 -> GLOBAL_TABELA_CUSTOS[13] ?: 0
            14 -> GLOBAL_TABELA_CUSTOS[14] ?: 0
            15 -> GLOBAL_TABELA_CUSTOS[15] ?: 0
            else -> -1
        }
    }

    fun descobrir_modificador_por_atributo_final(atributoFinalForca: Int): Int {
        var valor = atributoFinalForca
        return when {
            valor == 1 -> -5
            valor == 2 || valor == 3 -> -4
            valor == 4 || valor == 5 -> -3
            valor == 6 || valor == 7 -> -2
            valor == 8 || valor == 9 -> -1
            valor == 10 || valor == 11 -> 0
            valor == 12 || valor == 13 -> +1
            valor == 14 || valor == 15 -> +2

            valor == 16 || valor == 17 -> +3
            valor == 18 || valor == 19 -> +4
            valor == 20 || valor == 21 -> +5
            valor == 22 || valor == 23 -> +6
            valor == 24 || valor == 25 -> +7
            valor == 26 || valor == 27 -> +8
            valor == 28 || valor == 29 -> +9
            valor >= 30 -> +10
            else -> 0
        }
    }


    val MENU_OPTIONS = arrayOf(
        "1. Anão",
        "2. Anão da montanha",
        "3. Anão da colina",

        "4. Humano",

        "5. Draconato",

        "6. Meio-orc",

        "7. Elfo",
        "8. Alto-elfo",
        "9. Meio-elfo",
        "10. Elfo da floresta",

        "11. Gnomo",
        "12. Gnomo das rochas",
        "13. Gnomo da floresta ",

        "14. Halfling",
        "15. Halfling robusto",
        "16. Halfling pés-leves",

        "17. Tiefling",
        "18. Drow",

        )

    fun nome_raca_por_id(valorID: Int?): String {

        var index = (valorID ?: -1) - 1

        if (index < 0) {
            println("Raça menor que 1, portanto será setado a raça [ Anão ]")
            index = 0
        }
        if (index > 18) {
            println("Raça maior que 18, portanto será setado a raça [ Drow ]")
            index = 17
        }
        // Verifica se o índice é válido
        return if (index in MENU_OPTIONS.indices) {
            MENU_OPTIONS[index].substringAfter(". ") // Remove o número e ponto inicial
        } else {
            return ""
        }
    }

    fun mostrar_menu_personagem(): Array<String> {
        return MENU_OPTIONS
    }


    fun ler_numero_valido(scanner: Scanner): Int {
        while (true) {
            val input = scanner.nextLine()
            try {
                return input.toInt()
            } catch (e: NumberFormatException) {
                println("Entrada inválida. Por favor, insira um número válido.")
            }
        }
    }


}