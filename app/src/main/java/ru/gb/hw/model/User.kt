package ru.gb.hw.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val login: String,
    val password: String
) : Parcelable
