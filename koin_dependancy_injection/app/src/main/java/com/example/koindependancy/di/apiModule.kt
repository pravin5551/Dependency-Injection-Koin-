package com.example.koindependancy.di

import com.example.koindependancy.GithubApi
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    fun provideUseApi(retrofit: Retrofit): GithubApi {
        return retrofit.create(GithubApi::class.java)
    }

    single { provideUseApi(get()) }
}