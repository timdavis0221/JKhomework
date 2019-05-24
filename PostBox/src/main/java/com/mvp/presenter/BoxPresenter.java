package com.mvp.presenter;

import com.mvp.model.BoxModel;
import com.mvp.model.IBoxModel;
import com.mvp.view.IBoxView;

public class BoxPresenter {
    private IBoxView boxView;
    private IBoxModel boxModel;

    public BoxPresenter(IBoxView boxView) {
        this.boxView = boxView;
        this.boxModel = new BoxModel();
    }

    public void findSuitableBoxFromModel(float length, float width, float height) {
        System.out.println("Presenter : find SuitableBox From Model");
        boxModel.setBoxSize(length, width, height);
        returnCheckResult();
    }

    private void returnCheckResult() {
        String boxResult = boxModel.throwVerifiedBoxBackToClient();
        if (boxResult != null && boxResult.length() > 0) {
            // update view
            boxView.reportResultToClient(boxResult);
        } else {
            boxView.reportResultToClient("no suitable box for you sorry ...");
        }
    }
}
