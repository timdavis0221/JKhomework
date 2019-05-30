package com.mvp.model.kt

import com.mvp.bean.kt.BaseBox
import com.mvp.bean.kt.Box3
import com.mvp.bean.kt.Box5

class BoxModel : IBoxModel {

    private lateinit var box3 : BaseBox
    private lateinit var box5: BaseBox

    override fun setBoxSize(length: Float?, width: Float?, height: Float?) {
        box3 = Box3(length, width, height)
        box5 = Box5(length, width, height)
    }

    override fun returnVerifiedBoxToClient(): String? {
        println("Model : verified input box size by Model")
        if (box3.validateReceivedBox()) {
            return "box3"
        } else if (box5.validateReceivedBox()) {
            return "box5"
        } else {
            return null
        }
    }
}