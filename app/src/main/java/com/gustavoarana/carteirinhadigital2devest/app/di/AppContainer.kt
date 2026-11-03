package com.gustavoarana.carteirinhadigital2devest.app.di

import com.gustavoarana.carteirinhadigital2devest.core.auth.SessionTokenStore
import com.gustavoarana.carteirinhadigital2devest.feature.aluno.unidadescurriculares.domain.repository.UnidadeCurricularRepository
import com.gustavoarana.carteirinhadigital2devest.feature.login.domain.repository.LoginRepository
import com.gustavoarana.carteirinhadigital2devest.feature.professor.turmas.domain.repository.TurmaProfessorRepository
import com.gustavoarana.carteirinhadigital2devest.feature.professor.unidadescurriculares.domain.repository.UnidadeCurricularProfessorRepository

interface AppContainer {
    val sessionTokenStore: SessionTokenStore
    val loginRepository: LoginRepository
    val unidadeCurricularRepository: UnidadeCurricularRepository
    val turmaProfessorRepository: TurmaProfessorRepository
    val unidadeCurricularProfessorRepository: UnidadeCurricularProfessorRepository
}
