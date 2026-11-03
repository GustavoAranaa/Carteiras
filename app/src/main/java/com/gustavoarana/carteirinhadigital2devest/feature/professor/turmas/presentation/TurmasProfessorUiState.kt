package com.gustavoarana.carteirinhadigital2devest.feature.professor.turmas.presentation

import com.gustavoarana.carteirinhadigital2devest.feature.professor.turmas.domain.model.TurmaProfessor

data class TurmasProfessorUiState(val isLoading: Boolean = false, val turmas: List<TurmaProfessor> = emptyList(), val errorMessage: String? = null)
