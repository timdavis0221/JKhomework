package com.mvp.bean.kt

class Box3(length: Float?, width: Float?, height: Float?) : BaseBox(length, width, height) {

    init {
        // property define in constructor without val can only access in init block
        println("set box3 length to base box, length = $length")
        println("set box3 width to base box, width = $width")
        println("set box3 height to base box, height = $height")
    }

}