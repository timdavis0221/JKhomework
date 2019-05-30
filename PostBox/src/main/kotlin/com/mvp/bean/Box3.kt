package com.mvp.bean.kt

class Box3(length: Float?, width: Float?, height: Float?) : BaseBox(length, width, height) {

    private val lengthOfBox3 = 23f
    private val widthOfBox3 = 14f
    private val heightOfBox3 = 13f

    init {
        // property define in constructor without val can only access in init block
        println("set box3 length to base box, length = $length")
        println("set box3 width to base box, width = $width")
        println("set box3 height to base box, height = $height")
    }

    override fun validateReceivedBox() : Boolean {
        val totalSizeOfBox3 = lengthOfBox3 + widthOfBox3 + heightOfBox3
        val totalInputSize = super.length!! + super.width!! + super.height!!

        if (super.length!! > lengthOfBox3 || super.width!! > widthOfBox3 || super.height!! > heightOfBox3)
            return false
        else if (totalInputSize <= totalSizeOfBox3)
            return true
        else
            return true
    }
}