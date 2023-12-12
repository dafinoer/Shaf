package com.dafinrs.shaf.android.di

import com.google.firebase.Firebase
import com.google.firebase.database.database
import org.koin.dsl.module

val appModules = module {
    single { Firebase.database }
}