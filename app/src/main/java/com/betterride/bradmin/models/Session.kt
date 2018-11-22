package com.betterride.bradmin.models

import android.os.Bundle

data class Session(
    val id: String = "",
    val date: String,
    val started_at: String,
    val finished_at: String,
    val avenue_first: String,
    val avenue_second: String) {
    companion object {
        fun from(bundle: Bundle): Session{
            return Session(
                bundle.getString("id")!!,
                bundle.getString("date")!!,
                bundle.getString("started_at")!!,
                bundle.getString("finished_at")!!,
                bundle.getString("avenue_first")!!,
                bundle.getString("avenue_second")!!
            )
        }
    }

    fun toBundle(): Bundle {
        val bundle = Bundle()
        bundle.putString("id",id)
        bundle.putString("date",date)
        bundle.putString("started_at", started_at)
        bundle.putString("finished_at",finished_at)
        bundle.putString("avenue_first",avenue_first)
        bundle.putString("avenue_second",avenue_second)
        return bundle
    }
}