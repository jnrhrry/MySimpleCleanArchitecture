package com.januar.mysimplecleanarchitecture.domain

class MessageInteractor(private val messageRepository: IMessageRepository): MessageUsesCase{
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }

}