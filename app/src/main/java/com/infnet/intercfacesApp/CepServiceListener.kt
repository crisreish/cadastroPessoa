package com.infnet.intercfacesApp

interface CepServiceListener {

    fun obterEnderecoTerminou(endereco: Endereco?)

    fun falhaReportada(falha : String?)

}