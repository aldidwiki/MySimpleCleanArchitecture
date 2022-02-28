package com.aldidwiki.mysimplecleanarchitecture.di

import com.aldidwiki.mysimplecleanarchitecture.data.IMessageDataSource
import com.aldidwiki.mysimplecleanarchitecture.data.MessageDataSource
import com.aldidwiki.mysimplecleanarchitecture.data.MessageRepository
import com.aldidwiki.mysimplecleanarchitecture.domain.IMessageRepository
import com.aldidwiki.mysimplecleanarchitecture.domain.MessageInteractor
import com.aldidwiki.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase = MessageInteractor(provideRepository())

    private fun provideRepository(): IMessageRepository = MessageRepository(provideDataSource())

    private fun provideDataSource(): IMessageDataSource = MessageDataSource()
}