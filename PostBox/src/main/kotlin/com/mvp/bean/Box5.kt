package com.mvp.bean.kt

class Box5(length: Float?, width: Float?, height: Float?) : BaseBox(length, width, height) {

    init {
        // property define in constructor without val can only access in init block
        println("set box5 length to base box, length = $length")
        println("set box5 width to base box, width = $width")
        println("set box5 height to base box, height = $height")
    }

}