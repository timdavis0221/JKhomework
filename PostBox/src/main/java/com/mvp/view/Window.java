package com.mvp.view;

import com.mvp.presenter.BoxPresenter;

public class Window implements IBoxView {

    private BoxPresenter boxPresenter;

    public Window() {
        this.boxPresenter = new BoxPresenter(this);
    }

    protected void receivedBox(float length, float width, float height) {
        System.out.println("View : received a box");
        boxPresenter.findSuitableBoxFromModel(length, width, height);
    }

    @Override
    public void reportResultToClient(String box) {
        System.out.println("View : show the box => " + box);
    }
}
