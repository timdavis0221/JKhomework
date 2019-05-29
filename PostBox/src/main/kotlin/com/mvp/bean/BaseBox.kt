package com.mvp.bean.kt

abstract class BaseBox(val length: Float,
                       val width: Float,
                       val height: Float) {

    open val baseLength = length

    abstract fun validateReceivedBox() : Boolean
}