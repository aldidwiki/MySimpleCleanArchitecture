package com.aldidwiki.mysimplecleanarchitecture.data

import com.aldidwiki.mysimplecleanarchitecture.domain.IMessageRepository
import com.aldidwiki.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}