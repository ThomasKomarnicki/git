package com.thomask.headphonecontrols

import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.IBinder
import android.util.Log

class MediaControlService : Service() {

    private val mediaControlIntent = IntentFilter(Intent.ACTION_MEDIA_BUTTON)
    private val receiver = MediaControlsReceiver()
    private val tag = "MediaControlService"

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        registerReceiver(receiver, mediaControlIntent)
        return super.onStartCommand(intent, flags, startId)
    }

    inner class MediaControlsReceiver : BroadcastReceiver() {

        override fun onReceive(context: Context?, intent: Intent?) {
            Log.d(tag, "On Media Button press")
        }
    }
}
