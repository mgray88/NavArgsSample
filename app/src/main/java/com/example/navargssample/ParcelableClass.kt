package com.example.navargssample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ParcelableClass(
    val foobar: String
): Parcelable
