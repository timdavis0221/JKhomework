package com.mvp.presenter.kt

import com.mvp.model.kt.BoxModel
import com.mvp.model.kt.IBoxModel
import com.mvp.view.kt.IBoxView

class BoxPresenter(private val boxView: IBoxView,
                   private val boxModel: IBoxModel = BoxModel()) {

    fun findSuitableBoxFromModel(length: Float?, width: Float?, height: Float?) {
        println("Presenter : find SuitableBox From Model")
        boxModel.setBoxSize(length, width, height)
    }

    private fun returnCheckResult() {
        boxView.reportResultToClient("")
    }

}