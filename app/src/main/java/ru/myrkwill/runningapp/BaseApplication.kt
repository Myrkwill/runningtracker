package ru.myrkwill.runningapp

import android.app.Application
import com.yandex.mapkit.MapKitFactory
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey(R.string.yandex_map_key.toString())
        Timber.plant(Timber.DebugTree())
    }

}