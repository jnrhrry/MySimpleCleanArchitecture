package com.januar.mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.januar.mysimplecleanarchitecture.domain.MessageEntity
import com.januar.mysimplecleanarchitecture.domain.MessageUsesCase

class MainViewModel(private val messageUseCase: MessageUsesCase): ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
    get() = _message

    fun setName(name:String){
        _message.value = messageUseCase.getMessage(name)
    }
}