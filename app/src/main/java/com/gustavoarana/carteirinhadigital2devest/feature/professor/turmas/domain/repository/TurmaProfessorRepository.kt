package com.gustavoarana.carteirinhadigital2devest.feature.professor.turmas.domain.repository

import com.gustavoarana.carteirinhadigital2devest.feature.professor.turmas.domain.model.TurmaProfessor

interface TurmaProfessorRepository {
    suspend fun listar(): Result<List<TurmaProfessor>>
}
