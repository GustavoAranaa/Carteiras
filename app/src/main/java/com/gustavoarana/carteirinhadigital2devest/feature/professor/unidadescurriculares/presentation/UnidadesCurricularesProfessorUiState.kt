package com.gustavoarana.carteirinhadigital2devest.feature.professor.unidadescurriculares.presentation

import com.gustavoarana.carteirinhadigital2devest.feature.professor.unidadescurriculares.domain.model.UnidadeCurricularProfessor

data class UnidadesCurricularesProfessorUiState(val isLoading: Boolean = false, val unidades: List<UnidadeCurricularProfessor> = emptyList(), val errorMessage: String? = null)
