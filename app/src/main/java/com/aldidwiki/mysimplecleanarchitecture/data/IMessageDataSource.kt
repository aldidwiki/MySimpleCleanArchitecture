package com.aldidwiki.mysimplecleanarchitecture.data

import com.aldidwiki.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}