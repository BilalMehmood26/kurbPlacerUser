package com.employee.kurbplacers.utils

import android.os.Handler
import android.os.Looper

fun postDelayed(ms: Long, action: () -> Unit) {
    Handler(Looper.getMainLooper()).postDelayed({
        action.invoke()
    }, ms)
}