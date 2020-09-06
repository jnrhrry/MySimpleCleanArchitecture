package com.januar.mysimplecleanarchitecture.data

import com.januar.mysimplecleanarchitecture.domain.IMessageRepository
import com.januar.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)

}