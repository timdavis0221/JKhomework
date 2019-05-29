package com.mvp.model.kt

interface IBoxModel {
    fun setBoxSize(length: Float?, width: Float?, height: Float?)
    fun returnVerifiedBoxToClient() : String
}