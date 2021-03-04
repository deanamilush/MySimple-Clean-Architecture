package com.dean.mysimplecleanarchitecture.di

import com.dean.mysimplecleanarchitecture.data.MessageDataSource
import com.dean.mysimplecleanarchitecture.data.MessageRepository
import com.dean.mysimplecleanarchitecture.domain.IMessageRepository
import com.dean.mysimplecleanarchitecture.domain.MessageInteractor
import com.dean.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): MessageDataSource {
        return MessageDataSource()
    }
}