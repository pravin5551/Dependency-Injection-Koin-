package com.example.koindependancy.di

import com.example.koindependancy.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        UserRepository(get())
    }
}