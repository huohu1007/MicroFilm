package com.micro.film

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

/**
 * Created by ZhaoFei on 2017/6/16.
 * Mail:huohu1007@163.com
 * Tel: +8615922404976
 */
class HostApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}