package com.mvp.view.kt

import com.mvp.presenter.kt.BoxPresenter

class Window : IBoxView {

    private val boxPresenter: BoxPresenter? by lazy { BoxPresenter(this) }

    fun receivedBox(length: Float?, width: Float?, height: Float?) {
        println("View : received a box")
        boxPresenter?.findSuitableBoxFromModel(length, width, height)
    }

    override fun reportResultToClient(result: String) {
        println("View : show the box => $result")
    }
}