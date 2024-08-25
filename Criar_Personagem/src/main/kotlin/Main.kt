package org.appsskilldeveloper

import org.appsskilldeveloper.personagem.NovoPersonagem
import org.appsskilldeveloper.personagem.Racas.*
import org.appsskilldeveloper.personagem.Utils.Constantes
import org.example.atributos.*


var GLOBAL_UTIL: Constantes = Constantes()
fun main() {


    val scanner = java.util.Scanner(System.`in`)

    println("~~~~ Informe o nome do personagem ")
    val nomePersonagem = scanner.nextLine()


    println("~~~~ Informe a raça do personagem ")
    val menu = GLOBAL_UTIL.mostrar_menu_personagem()
    for (opcao in menu) {
        println(opcao)
    }
    val inputRaca = GLOBAL_UTIL.ler_numero_valido(scanner)
    val nomeRacaEscolhido = GLOBAL_UTIL.nome_raca_por_id(inputRaca)

    val personagem_X: NovoPersonagem = when (nomeRacaEscolhido.lowercase() ) {
        "anão" -> NovoPersonagem(RacaAnao())
        "anão da montanha" -> NovoPersonagem(RacaAnaoDaMontanha())
        "anão da colina" -> NovoPersonagem(RacaAnaoDaColina())

        "humano" -> NovoPersonagem(RacaHumano())

        "draconato" -> NovoPersonagem(RacaDraconato())

        "meio-orc" -> NovoPersonagem(RacaMeioOrc())

        "elfo" -> NovoPersonagem(RacaElfo())
        "alto-elfo" -> NovoPersonagem(RacaAltoElfo())
        "meio-elfo" -> NovoPersonagem(RacaMeioElfo())
        "elfo da floresta" -> NovoPersonagem(RacaElfoDaFloresta())

        "gnomo" -> NovoPersonagem(RacaGnomo())
        "gnomo das rochas" -> NovoPersonagem(RacaGnomoDasRochas())
        "gnomo da floresta" -> NovoPersonagem(RacaGnomoDaFloresta())

        "halfling" -> NovoPersonagem(RacaHalfling())
        "halfling robusto" -> NovoPersonagem(RacaHalflingRobusto())
        "halfling pés-leves" -> NovoPersonagem(RacaHalflingPesLeves())

        "tiefling" -> NovoPersonagem(RacaTiefling())
        "drow" -> NovoPersonagem(RacaDrow())
        else -> NovoPersonagem(RacaAnao())
    }

    println("Raça [ ${personagem_X.objRaca.nome_raca()} ] selecionada")

    //////////////////////////////////////
    //////////////////////////////////////
    //////////////////////////////////////

    var restante = 0
    var VALOR_INICIAL = 27
    var forcaInput: Int

    do {
        println("\n\n~~~~ Informe o nível de Força [ escolha entre 8 e 15 ] ")
        forcaInput = GLOBAL_UTIL.ler_numero_valido(scanner)
        forcaInput = GLOBAL_UTIL.filtro_input_custos(forcaInput)

        val restAux = restante
        var custoHabilidade = GLOBAL_UTIL.descobrir_custo_de_habilidade(forcaInput)
        restante = VALOR_INICIAL - custoHabilidade
        if (restante <= -1) {
            restante = restAux
            custoHabilidade = -1
            println("Ops! -  você não pode distribuir valores tão alto | $restante")
        }
    } while (custoHabilidade == -1)
    personagem_X.aplicar_forca(Forca(forcaInput))

    //////////////////////////////////////
    //////////////////////////////////////
    //////////////////////////////////////
    var destrezaInput: Int
    do {
        println("\n\n~~~~ Informe o nível de Destreza [ escolha entre 8 e 15 ] ")
        println("~~~~ Ainda resta $restante pontos para ser distribuidos")
        destrezaInput = GLOBAL_UTIL.ler_numero_valido(scanner)
        destrezaInput = GLOBAL_UTIL.filtro_input_custos(destrezaInput)

        val restAux = restante
        var custoHabilidade = GLOBAL_UTIL.descobrir_custo_de_habilidade(destrezaInput)
        restante = restante - custoHabilidade
        if (restante <= -1) {
            restante = restAux
            custoHabilidade = -1
            println("Ops! -  você não pode distribuir valores tão alto")
        }
    } while (custoHabilidade == -1)
    personagem_X.aplicar_destreza(Destreza(destrezaInput))

    //////////////////////////////////////
    //////////////////////////////////////
    //////////////////////////////////////


    var inteligenciaInput: Int
    do {
        println("\n\n~~~~ Informe o nível de Inteligência [ escolha entre 8 e 15 ] ")
        println("~~~~ Ainda resta $restante pontos para ser distribuidos")
        inteligenciaInput = GLOBAL_UTIL.ler_numero_valido(scanner)
        inteligenciaInput = GLOBAL_UTIL.filtro_input_custos(inteligenciaInput)
        val restAux = restante
        var custoHabilidade = GLOBAL_UTIL.descobrir_custo_de_habilidade(inteligenciaInput)
        restante = restante - custoHabilidade
        if (restante <= -1) {
            restante = restAux
            custoHabilidade = -1
            println("Ops! -  você não pode distribuir valores tão alto")
        }
    } while (custoHabilidade == -1)
    personagem_X.aplicar_inteligencia(Inteliencia(inteligenciaInput))

    //////////////////////////////////////
    //////////////////////////////////////
    //////////////////////////////////////


    var carismaInput: Int
    do {
        println("\n\n~~~~ Informe o nível de Carisma [ escolha entre 8 e 15 ] ")
        println("~~~~ Ainda resta $restante pontos para ser distribuidos")
        carismaInput = GLOBAL_UTIL.ler_numero_valido(scanner)
        carismaInput = GLOBAL_UTIL.filtro_input_custos(carismaInput)
        val restAux = restante
        var custoHabilidade = GLOBAL_UTIL.descobrir_custo_de_habilidade(carismaInput)
        restante = restante - custoHabilidade
        if (restante <= -1) {
            restante = restAux
            custoHabilidade = -1
            println("Ops! -  você não pode distribuir valores tão alto")
        }
    } while (custoHabilidade == -1)
    personagem_X.aplicar_carisma(Carisma(carismaInput))

    //////////////////////////////////////
    //////////////////////////////////////
    //////////////////////////////////////


    var constituicaoInput: Int
    do {
        println("\n\n~~~~ Informe o nível de Constituição [ escolha entre 8 e 15 ] ")
        println("~~~~ Ainda resta $restante pontos para ser distribuidos")
        constituicaoInput = GLOBAL_UTIL.ler_numero_valido(scanner)
        constituicaoInput = GLOBAL_UTIL.filtro_input_custos(constituicaoInput)
        val restAux = restante
        var custoHabilidade = GLOBAL_UTIL.descobrir_custo_de_habilidade(constituicaoInput)
        restante = restante - custoHabilidade
        if (restante <= -1) {
            restante = restAux
            custoHabilidade = -1
            println("Ops! -  você não pode distribuir valores tão alto")
        }
    } while (custoHabilidade == -1)
    personagem_X.aplicar_constituicao(Constituicao(constituicaoInput))

    //////////////////////////////////////
    //////////////////////////////////////
    //////////////////////////////////////


    var sabedoriaInput: Int
    do {
        println("\n\n~~~~ Informe o nível de Sabedoria [ escolha entre 8 e 15 ] ")
        println("~~~~ Ainda resta $restante pontos para ser distribuidos")
        sabedoriaInput = GLOBAL_UTIL.ler_numero_valido(scanner)
        sabedoriaInput = GLOBAL_UTIL.filtro_input_custos(sabedoriaInput)
        val restAux = restante
        var custoHabilidade = GLOBAL_UTIL.descobrir_custo_de_habilidade(sabedoriaInput)
        restante = restante - custoHabilidade
        if (restante <= -1) {
            restante = restAux
            custoHabilidade = -1
            println("Ops! -  você não pode distribuir valores tão alto")
        }
    } while (custoHabilidade == -1)
    personagem_X.aplicar_sabedoria(Sabedoria(sabedoriaInput))


    //////////////////////////////////////
    //////////////////////////////////////
    //////////////////////////////////////

    personagem_X.criar_personagem(nomePersonagem)

}
