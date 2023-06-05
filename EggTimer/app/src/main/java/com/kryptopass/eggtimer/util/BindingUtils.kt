package com.kryptopass.eggtimer.util

import android.text.format.DateUtils
import android.widget.TextView
import androidx.databinding.BindingAdapter

/**
 * Converts milliseconds to formatted mm:ss
 * @param value, time in milliseconds.
 */
@BindingAdapter("elapsedTime")
fun elapsedTime(textView: TextView, value: Long) {
    val seconds = value / 1000
    textView.text = if (seconds < 60) seconds.toString() else DateUtils.formatElapsedTime(seconds)
}
