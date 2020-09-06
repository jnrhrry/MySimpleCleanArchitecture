package com.januar.mysimplecleanarchitecture.data

import com.januar.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name, Welcome to Clean Architecture")
}