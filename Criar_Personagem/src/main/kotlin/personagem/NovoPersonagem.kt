package org.appsskilldeveloper.personagem

import org.appsskilldeveloper.personagem.Racas.Raca
import org.appsskilldeveloper.personagem.Utils.Constantes
import org.example.atributos.*
import java.io.File



open class NovoPersonagem(
    var objRaca: Raca,
)
{
    var GLOBAL_NOME_PERSONAGEM = ""

    var GLOBAL_VALOR_FORCA = 0
    var GLOBAL_VALOR_DESTREZA = 0
    var GLOBAL_VALOR_INTELIGENCIA = 0
    var GLOBAL_VALOR_CARISMA = 0
    var GLOBAL_VALOR_CONSTITUICAO = 0
    var GLOBAL_VALOR_SABEDORIA = 0

    val VALOR_ATRIBUTO_INCIAL = 8

    var GLOBAL_UTIL : Constantes = Constantes()

    fun criar_personagem(nomePersonagem: String){
        this.GLOBAL_NOME_PERSONAGEM = nomePersonagem


// Força
        var custoForca = GLOBAL_UTIL.descobrir_custo_de_habilidade(GLOBAL_VALOR_FORCA)
        var bonusForca = objRaca.descobrir_bonus_por_raca("Forca")
        var atributoFinalForca = (bonusForca + GLOBAL_VALOR_FORCA)
        var modificadorForca = GLOBAL_UTIL.descobrir_modificador_por_atributo_final(atributoFinalForca)
        var jsonForca = criar_json_atributo("Forca",GLOBAL_VALOR_FORCA,custoForca,bonusForca,atributoFinalForca,modificadorForca)

// Destreza
        var custoDestreza = GLOBAL_UTIL.descobrir_custo_de_habilidade(GLOBAL_VALOR_DESTREZA)
        var bonusDestreza = objRaca.descobrir_bonus_por_raca("Destreza")
        var atributoFinalDestreza = (bonusDestreza + GLOBAL_VALOR_DESTREZA)
        var modificadorDestreza = GLOBAL_UTIL.descobrir_modificador_por_atributo_final(atributoFinalDestreza)
        var jsonDestreza = criar_json_atributo("Destreza",GLOBAL_VALOR_DESTREZA,custoDestreza,bonusDestreza,atributoFinalDestreza,modificadorDestreza)

// Inteligencia
        var custoInteligencia = GLOBAL_UTIL.descobrir_custo_de_habilidade(GLOBAL_VALOR_INTELIGENCIA)
        var bonusInteligencia = objRaca.descobrir_bonus_por_raca("Inteligencia")
        var atributoFinalInteligencia = (bonusInteligencia + GLOBAL_VALOR_INTELIGENCIA)
        var modificadorInteligencia = GLOBAL_UTIL.descobrir_modificador_por_atributo_final(atributoFinalInteligencia)
        var jsonInteligencia = criar_json_atributo("Inteligencia",GLOBAL_VALOR_INTELIGENCIA,custoInteligencia,bonusInteligencia,atributoFinalInteligencia,modificadorInteligencia)

// Carisma
        var custoCarisma = GLOBAL_UTIL.descobrir_custo_de_habilidade(GLOBAL_VALOR_CARISMA)
        var bonusCarisma = objRaca.descobrir_bonus_por_raca("Carisma")
        var atributoFinalCarisma = (bonusCarisma + GLOBAL_VALOR_CARISMA)
        var modificadorCarisma = GLOBAL_UTIL.descobrir_modificador_por_atributo_final(atributoFinalCarisma)
        var jsonCarisma = criar_json_atributo("Carisma",GLOBAL_VALOR_CARISMA,custoCarisma,bonusCarisma,atributoFinalCarisma,modificadorCarisma)


// Constituicao
        var custoConstituicao = GLOBAL_UTIL.descobrir_custo_de_habilidade(GLOBAL_VALOR_CONSTITUICAO)
        var bonusConstituicao = objRaca.descobrir_bonus_por_raca("Constituicao")
        var atributoFinalConstituicao = (bonusConstituicao + GLOBAL_VALOR_CONSTITUICAO)
        var modificadorConstituicao = GLOBAL_UTIL.descobrir_modificador_por_atributo_final(atributoFinalConstituicao)
        var jsonConstituicao = criar_json_atributo("Constituicao",GLOBAL_VALOR_CONSTITUICAO,custoConstituicao,bonusConstituicao,atributoFinalConstituicao,modificadorConstituicao)

// Sabedoria
        var custoSabedoria = GLOBAL_UTIL.descobrir_custo_de_habilidade(GLOBAL_VALOR_SABEDORIA)
        var bonusSabedoria = objRaca.descobrir_bonus_por_raca("Sabedoria")
        var atributoFinalSabedoria = (bonusSabedoria + GLOBAL_VALOR_SABEDORIA)
        var modificadorSabedoria = GLOBAL_UTIL.descobrir_modificador_por_atributo_final(atributoFinalSabedoria)
        var jsonSabedoria = criar_json_atributo("Sabedoria",GLOBAL_VALOR_SABEDORIA,custoSabedoria,bonusSabedoria,atributoFinalSabedoria,modificadorSabedoria)


        var valorXP = 10 + modificadorConstituicao


        println("\n\nPersonagem criado com sucesso !")
        var jsonAtributosConcatenados = concatenar_atributos(jsonForca,jsonDestreza,jsonInteligencia,jsonCarisma,jsonConstituicao,jsonSabedoria)
        var jsonPersonagem = criar_json_personagem(nomePersonagem,valorXP,jsonAtributosConcatenados)
        gravar_arquivo_local(jsonPersonagem,"dados_personagem.json")



    // mostrar personagem

        //// montar uma tabela

        var txtPainel = ""
        txtPainel += "\n############################################################################################################"
        txtPainel += "\n################################# FICHA PERSONAGEM #########################################################"
        txtPainel += "\n############################################################################################################"
        txtPainel += "\n# Nome Personagem : $nomePersonagem"
        txtPainel += "\n# Raça  : ${objRaca.nome_raca()}"
        txtPainel += "\n# Valor do XP  : $valorXP"
        txtPainel += "\n#########    |  BASE    |  INPUT  |    CUSTO  |  B.RAÇA  |  A.FINAL  |  MODIFIC."
        txtPainel += "\n# FORÇA       |     8    |   $GLOBAL_VALOR_FORCA     |     $custoForca    |    $bonusForca    |    $atributoFinalForca      |    $modificadorForca"
        txtPainel += "\n# INTELG      |     8    |   $GLOBAL_VALOR_INTELIGENCIA     |     $custoInteligencia    |    $bonusInteligencia    |    $atributoFinalInteligencia      |    $modificadorInteligencia"
        txtPainel += "\n# CARISM      |     8    |   $GLOBAL_VALOR_CARISMA     |     $custoCarisma    |    $bonusCarisma    |    $atributoFinalCarisma      |    $modificadorCarisma"
        txtPainel += "\n# CONSTI      |     8    |   $GLOBAL_VALOR_CONSTITUICAO     |     $custoConstituicao    |    $bonusConstituicao    |    $atributoFinalConstituicao      |    $modificadorConstituicao"
        txtPainel += "\n# SABEDO      |     8    |   $GLOBAL_VALOR_SABEDORIA     |     $custoSabedoria    |    $bonusSabedoria    |    $atributoFinalSabedoria      |    $modificadorSabedoria"
        txtPainel += "\n############################################################################################################"

        txtPainel += "\n Aluno: Renan Dutra Ferreira  | GRM: 40250415  "
        println(txtPainel)



    }

    fun aplicar_carisma(carisma :Carisma){
        this.GLOBAL_VALOR_CARISMA = carisma.recuperar_valor_input()
    }
    fun aplicar_constituicao(constituicao :Constituicao){
        this.GLOBAL_VALOR_CONSTITUICAO = constituicao.recuperar_valor_input()
    }
    fun aplicar_destreza(destreza :Destreza){
        this.GLOBAL_VALOR_DESTREZA = destreza.recuperar_valor_input()
    }
    fun aplicar_forca(forca :Forca){
        this.GLOBAL_VALOR_FORCA = forca.recuperar_valor_input()
    }
    fun aplicar_inteligencia(inteligencia :Inteliencia){
        this.GLOBAL_VALOR_INTELIGENCIA = inteligencia.recuperar_valor_input()
    }
    fun aplicar_sabedoria(sabedoria :Sabedoria){
        this.GLOBAL_VALOR_SABEDORIA = sabedoria.recuperar_valor_input()
    }


    fun criar_json_personagem(nomePersonagem : String , valorXP :Int,jsonAtributos : String) : String{
        return "{ \"nomePersonagem\" : \"$nomePersonagem\" , \"valorXP\": $valorXP , $jsonAtributos  }"
    }


    fun criar_json_atributo(nomeAtributo: String , pontosInputados : Int, valorCusto : Int , valorBonus : Int , valorAtributoFinal :Int, valormodificador :Int  ): String {
        return "\"$nomeAtributo\" : {" +
                "\"valorFixo\": $VALOR_ATRIBUTO_INCIAL," +
                "\"pontosInputados\": $pontosInputados," +
                "\"valorCusto\": $valorCusto," +
                "\"valorBonus\": $valorBonus," +
                "\"valorAtributoFinal\": $valorAtributoFinal," +
                "\"valormodificador\": $valormodificador}"
    }

    fun concatenar_atributos(atribForca : String ,atribDestreza : String ,atribInteligencia : String ,atribCarisma : String ,atribConstituicao : String ,atribSabedoria : String) : String
    {
        return  " $atribForca,  $atribDestreza,  $atribInteligencia,  $atribCarisma,  $atribConstituicao,  $atribSabedoria "
    }


    fun gravar_arquivo_local(json: String, nomeArquivo: String) {
        val arquivo = File(nomeArquivo)
        arquivo.writeText(json)
        println("Arquivo local de nome [ $nomeArquivo ] gravado com sucesso !")
    }

}



