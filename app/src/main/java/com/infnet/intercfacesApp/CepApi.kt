package com.infnet.intercfacesApp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CepApi {

    @GET("CEP/json/")
    fun obterEndereco(@Path("CEP") CEP : String?): Call<Endereco?>?

}