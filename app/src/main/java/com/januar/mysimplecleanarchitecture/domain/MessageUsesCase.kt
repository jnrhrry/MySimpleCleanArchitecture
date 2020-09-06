package com.januar.mysimplecleanarchitecture.domain

interface MessageUsesCase {
    fun getMessage(name: String): MessageEntity
}