package com.app.loginflowapp.utils

import android.content.Context
import android.content.Context.MODE_PRIVATE

object SharedPref {
    fun storeData(
        email: String,
        password: String,
        fullName: String,
        userName: String,
        bio: String,
        imageUrl: String,
        context: Context
    ) {
        val sharedPreferences = context.getSharedPreferences("Users", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("fullName", fullName)
        editor.putString("userName", userName)
        editor.putString("bio", bio)
        editor.putString("email", email)
        editor.putString("password", password)
        editor.putString("imageUrl", imageUrl)
        editor.apply()
    }
}