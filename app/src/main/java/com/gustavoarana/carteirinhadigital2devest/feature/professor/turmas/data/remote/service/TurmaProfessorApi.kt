package com.gustavoarana.carteirinhadigital2devest.feature.professor.turmas.data.remote.service

import com.gustavoarana.carteirinhadigital2devest.feature.professor.turmas.data.remote.dto.TurmaProfessorDto
import retrofit2.http.GET

interface TurmaProfessorApi {
    @GET("professores/me/turmas")
    suspend fun listar(): List<TurmaProfessorDto>
}
