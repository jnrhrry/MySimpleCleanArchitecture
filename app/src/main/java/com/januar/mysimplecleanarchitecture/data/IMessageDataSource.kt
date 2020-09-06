package com.januar.mysimplecleanarchitecture.data

import com.januar.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}