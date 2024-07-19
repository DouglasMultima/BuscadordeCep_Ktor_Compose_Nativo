package com.compose.buscadordecep.ui.theme.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.compose.buscadordecep.ui.theme.repositorio.Repositorio
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class BuscarCepViewModel @Inject constructor(private val repositorio: Repositorio) :ViewModel() {


   fun buscarCep(
        cep:String,
        respostaDoServidor: (String,String,String,String) -> Unit,
        mensagemErro : (String) -> Unit
   )
    {

        viewModelScope.launch {

            repositorio.buscarCep(cep,respostaDoServidor,mensagemErro)
        }

    }








}