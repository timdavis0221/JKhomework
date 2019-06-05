package com.mvp.bean.kt

abstract class BaseBox(val length: Float?,
                       val width: Float?,
                       val height: Float?) {

    val lengthOfBox3 = 23f
    val widthOfBox3 = 14f
    val heightOfBox3 = 13f

    val lengthOfBox5 = 39.5f
    val widthOfBox5 = 27.5f
    val heightOfBox5 = 23f

    fun validateReceivedBox(constraintLength: Float?,
                            constraintWidth: Float?,
                            constraintHeight: Float?) : Boolean {

        val totalConstraintSize = constraintLength!! + constraintWidth!! + constraintHeight!!
        val totalInputSize = length!! + width!! + height!!

        if (length!! > constraintLength || width!! > constraintWidth || height!! > constraintHeight)
            return false
        else if (totalInputSize <= totalConstraintSize)
            return true
        else
            return true

    }
}