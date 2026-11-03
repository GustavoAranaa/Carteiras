package com.gustavoarana.carteirinhadigital2devest.feature.professor.unidadescurriculares.domain.repository

import com.gustavoarana.carteirinhadigital2devest.feature.professor.unidadescurriculares.domain.model.UnidadeCurricularProfessor

interface UnidadeCurricularProfessorRepository {
    suspend fun listar(): Result<List<UnidadeCurricularProfessor>>
}