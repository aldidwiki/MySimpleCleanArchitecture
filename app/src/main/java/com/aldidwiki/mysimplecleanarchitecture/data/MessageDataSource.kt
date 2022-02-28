package com.aldidwiki.mysimplecleanarchitecture.data

import com.aldidwiki.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name! Welcome to Clean Architecture")
    }
}