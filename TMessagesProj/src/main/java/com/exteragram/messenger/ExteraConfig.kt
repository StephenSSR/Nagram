package com.exteragram.messenger

import android.app.Activity
import android.content.SharedPreferences
import com.exteragram.messenger.preferences.ktx.boolean
import com.exteragram.messenger.preferences.ktx.int
import org.telegram.messenger.ApplicationLoader

object ExteraConfig {

    private val sharedPreferences: SharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", Activity.MODE_PRIVATE)

    // Appearance
    // Application
    // General
    var hideAllChats by sharedPreferences.boolean("hideAllChats", false)
    var hideProxySponsor by sharedPreferences.boolean("hideProxySponsor", true)
    var hidePhoneNumber by sharedPreferences.boolean("hidePhoneNumber", false)
    var showID by sharedPreferences.boolean("showID", false)
    var chatsOnTitle by sharedPreferences.boolean("chatsOnTitle", true)
    // Drawer

    // Chats
    // Stickers
    var stickerSize by sharedPreferences.int("stickerSize", 100)
    // General
    var hideKeyboardOnScroll by sharedPreferences.boolean("hideKeyboardOnScroll", true)
    var archiveOnPull by sharedPreferences.boolean("archiveOnPull", true)
    var dateOfForwardedMsg by sharedPreferences.boolean("dateOfForwardedMsg", false)
    // Media
}