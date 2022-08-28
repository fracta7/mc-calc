package com.fracta7.mccalc.di

import com.fracta7.mccalc.data.remote.MyAPI
import com.fracta7.mccalc.data.repository.MyRepositoryImpl
import com.fracta7.mccalc.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyAPI(): MyAPI {
        return Retrofit.Builder()
            .baseUrl("https://fracta7.com")
            .build()
            .create(MyAPI::class.java)
    }


}