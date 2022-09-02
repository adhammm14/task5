package com.example.recycleapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fruit(
    val fruitName:String,
    val fruitImage: Int,
    val shortDescription: String?
    ): Parcelable