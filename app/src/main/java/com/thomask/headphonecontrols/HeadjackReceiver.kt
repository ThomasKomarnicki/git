package com.thomask.headphonecontrols

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class HeadjackReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("HeadjackReceiver", "Action received")
        Log.d("HeadjackReceiver", intent.extras.toString())

        context.startService(Intent(context, MediaControlService::class.java))
    }
}
