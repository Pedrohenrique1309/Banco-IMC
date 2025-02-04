package br.senai.sp.jandira.imc.model

import br.senai.sp.jandira.imc.util.formatarDataParaBrasil
import java.time.LocalDate
import java.time.LocalTime


class Consulta {

    private var paciente: Paciente? = null
    private var medico: Medico? = null
    private var dataDaConsulta: LocalDate? = null
    private var horaConsulta: LocalTime? = null
    private var valor: Double = 0.0

    fun agendarConsulta(
        paciente: Paciente,
        medico: Medico,
        dataDaConsulta: LocalDate,
        horaConsulta: LocalTime,
        valor: Double
    ){

        this.paciente = paciente
        this.medico = medico
        this.dataDaConsulta = dataDaConsulta
        this.horaConsulta= horaConsulta
        this.valor = valor

    }

    fun mostrarDadosDaConsulta(){
        println("==============================================")
        println("DADOS DA CONSULTA")
        println("==============================================")
        println("DATA: ${formatarDataParaBrasil(dataDaConsulta!!)}")
        println("HORA: $horaConsulta ")
        println("PACIENTE: ${paciente!!.nome}")
        println("IMC: ${paciente!!.calcularImc()}")
        println("MEDICO: ${medico!!.nome}")
        println("==============================================")
    }
}