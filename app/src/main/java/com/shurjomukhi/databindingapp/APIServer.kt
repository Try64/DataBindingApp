package com.shurjomukhi.databindingapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface APIServer {


    @GET("api/v1/loans/{loanID}")//Assert matches API Doc ?: TRUE
    suspend fun getLoanDetails(@Path("loanID") loanID:String, @Header("X-Api-Key") token:String): Response<LoanDetails>


}