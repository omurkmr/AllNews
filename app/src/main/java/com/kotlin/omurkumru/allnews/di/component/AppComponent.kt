package com.kotlin.omurkumru.allnews.di.component

import android.app.Application
import com.kotlin.omurkumru.allnews.di.modules.AppModule
import com.kotlin.omurkumru.allnews.di.modules.BuildersModule
import com.kotlin.omurkumru.allnews.di.modules.NetModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class, BuildersModule::class, AppModule::class, NetModule::class]
)
interface AppComponent {
    fun inject(app: Application)
}