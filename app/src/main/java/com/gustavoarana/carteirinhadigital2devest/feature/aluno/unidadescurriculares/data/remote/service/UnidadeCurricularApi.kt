package com.gustavoarana.carteirinhadigital2devest.feature.aluno.unidadescurriculares.data.remote.service

import com.gustavoarana.carteirinhadigital2devest.feature.aluno.unidadescurriculares.data.remote.dto.UnidadeCurricularDto
import retrofit2.http.GET

interface UnidadeCurricularApi {

    @GET("unidades-curriculares")
    suspend fun listar(): List<UnidadeCurricularDto>
}