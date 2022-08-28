package com.fracta7.mccalc.di

import com.fracta7.mccalc.data.repository.MyRepositoryImpl
import com.fracta7.mccalc.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository
}