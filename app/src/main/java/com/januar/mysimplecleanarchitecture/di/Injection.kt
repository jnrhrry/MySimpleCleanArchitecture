package com.januar.mysimplecleanarchitecture.di

import com.januar.mysimplecleanarchitecture.data.IMessageDataSource
import com.januar.mysimplecleanarchitecture.data.MessageDataSource
import com.januar.mysimplecleanarchitecture.data.MessageRepository
import com.januar.mysimplecleanarchitecture.domain.IMessageRepository
import com.januar.mysimplecleanarchitecture.domain.MessageInteractor
import com.januar.mysimplecleanarchitecture.domain.MessageUsesCase

object Injection {
    fun provideUsesCase(): MessageUsesCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource{
        return MessageDataSource()
    }
}