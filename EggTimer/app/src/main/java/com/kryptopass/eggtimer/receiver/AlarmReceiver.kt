package com.kryptopass.eggtimer.receiver

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat
import com.kryptopass.eggtimer.R
import com.kryptopass.eggtimer.util.sendNotification

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val notificationManager = ContextCompat.getSystemService(
            context,
            NotificationManager::class.java
        ) as NotificationManager
        notificationManager.sendNotification(
            context.getText(R.string.eggs_ready).toString(),
            context
        )
    }
}