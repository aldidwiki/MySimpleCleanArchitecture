package com.aldidwiki.mysimplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}