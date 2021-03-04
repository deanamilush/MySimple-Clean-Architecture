package com.dean.mysimplecleanarchitecture.data

import com.dean.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource {
    fun getMessageFromSource(name: String) = MessageEntity("Hello! Welcome to Clean Architecture")
}