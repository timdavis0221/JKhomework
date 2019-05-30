package com.mvp.presenter.kt

import com.mvp.model.kt.BoxModel
import com.mvp.model.kt.IBoxModel
import com.mvp.view.kt.IBoxView

class BoxPresenter(private val boxView: IBoxView,
                   private val boxModel: IBoxModel = BoxModel()) {

    fun findSuitableBoxFromModel(length: Float?, width: Float?, height: Float?) {
        println("Presenter : try to find suitableBox from model")
        boxModel.setBoxSize(length, width, height)
        returnCheckResult()
    }

    private fun returnCheckResult() {
        val result = boxModel.returnVerifiedBoxToClient()
        if (result != null && result.isNotEmpty()) {
            boxView.reportResultToClient(result)
        } else {
            boxView.reportResultToClient("no suitable box for you sorry ...")
        }
    }

}