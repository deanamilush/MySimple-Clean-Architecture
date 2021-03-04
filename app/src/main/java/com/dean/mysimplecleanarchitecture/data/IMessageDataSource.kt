package com.dean.mysimplecleanarchitecture.data

import com.dean.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}