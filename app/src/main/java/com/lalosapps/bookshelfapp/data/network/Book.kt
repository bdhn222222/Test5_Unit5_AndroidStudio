package com.lalosapps.bookshelfapp.data.network

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("id") val id: String,
    @SerializedName("volumeInfo") val volumeInfo: VolumeInfo
    //GJson - tác giả, tene sách {tên sách : "name",
    //image : ""} -> Java / Kotlin
)