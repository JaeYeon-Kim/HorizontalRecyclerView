package com.kjy.horizontalrecyclerview

import android.app.Application


// Context를 받기 위한 또 하나의 클래스
class App : Application() {

    companion object {
        lateinit var instance: App
        private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}