package br.senai.sp.jandira.imc.model

class Medico {

    var id: Int = 0
    var nome: String =""
    var especialidades = ArrayList<String>()
    var email:String = ""

    fun exibirFichaDoMedico(){
        println("-----------------")
        println("FICHA DO MEDICO")
        println("-----------------")
        println("NOME: ${nome}")
        println("EMAIL: ${email}")
        println("EPECIALIDADES DO MEDICO:")
        for(especialidade in especialidades){
            println("  -> $especialidade")
        }
        println("===================")
    }
}


