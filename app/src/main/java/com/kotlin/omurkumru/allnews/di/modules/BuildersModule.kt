package com.kotlin.omurkumru.allnews.di.modules


import com.kotlin.omurkumru.allnews.ui.entrance.EntranceActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeEntranceActivity(): EntranceActivity
}