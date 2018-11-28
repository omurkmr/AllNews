package com.kotlin.omurkumru.allnews

import android.app.Activity
import android.app.Application
import com.kotlin.omurkumru.allnews.di.component.DaggerAppComponent
import com.kotlin.omurkumru.allnews.di.modules.AppModule
import com.kotlin.omurkumru.allnews.di.modules.NetModule
import com.kotlin.omurkumru.allnews.utils.networking.BASE_URL
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class Application: Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .netModule(NetModule(BASE_URL))
            .build().inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

}