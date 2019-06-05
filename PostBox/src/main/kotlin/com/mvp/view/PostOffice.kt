package com.mvp.view.kt

fun main() {
    enterPostOffice()
}

private fun enterPostOffice() {
    println("Hi, please enter your box size for validating")
    println("first, enter the length of box : ")
    val length = readLine()?.toFloat()
    println("then enter the width of box : ")
    val width = readLine()?.toFloat()
    println("finally enter the height of box :")
    val height = readLine()?.toFloat()

    val businessWindow = BusinessWindow()
    businessWindow.receivedBox(length, width, height)
}