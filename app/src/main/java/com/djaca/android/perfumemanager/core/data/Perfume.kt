package com.djaca.android.perfumemanager.core.data

data class Perfume(
    var id: Long,
    var name: String,
    var brand: String,
    var imageURL: String,
    var timeOFDay: TimeOFDay,
    var seasson: Seasson
)
