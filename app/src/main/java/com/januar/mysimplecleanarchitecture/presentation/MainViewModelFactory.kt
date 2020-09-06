package com.januar.mysimplecleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.januar.mysimplecleanarchitecture.di.Injection
import com.januar.mysimplecleanarchitecture.domain.MessageUsesCase

class MainViewModelFactory(private var messageUseCase:MessageUsesCase):
    ViewModelProvider.NewInstanceFactory(){

    companion object{
        @Volatile
        private var instance: MainViewModelFactory?=null

        fun getInstance(): MainViewModelFactory =
            instance ?: synchronized(this){
                instance ?: MainViewModelFactory(Injection.provideUsesCase())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUseCase) as T
            else -> throw  IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}