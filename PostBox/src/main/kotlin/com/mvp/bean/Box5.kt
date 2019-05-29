package com.mvp.bean.kt

class Box5(length: Float, width: Float, height: Float) : BaseBox(length, width, height) {

    private val lengthOfBox5 = 39.5f
    private val widthOfBox5 = 27.5f
    private val heightOfBox5 = 23f

    override fun validateReceivedBox() : Boolean {
        val totalSizeOfBox5 = lengthOfBox5 + widthOfBox5 + heightOfBox5
        val totalInputSize = super.length + super.width + super.height

        if (super.length > lengthOfBox5 || super.width > widthOfBox5 || super.height > heightOfBox5)
            return false
        else if (totalInputSize <= totalSizeOfBox5)
            return true
        else
            return true
    }
}