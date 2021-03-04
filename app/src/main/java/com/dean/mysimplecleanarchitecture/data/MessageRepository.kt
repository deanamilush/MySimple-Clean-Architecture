package com.dean.mysimplecleanarchitecture.data

import com.dean.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: MessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}