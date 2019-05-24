package com.mvp.model;

import com.mvp.bean.BaseBox;
import com.mvp.bean.Box3;
import com.mvp.bean.Box5;

public class BoxModel implements IBoxModel{

    private BaseBox[] boxes = new BaseBox[2];

    @Override
    public void setBoxSize(float length, float width, float height) {
        boxes[0] = new Box3(length, width, height);
        boxes[1] = new Box5(length, width, height);
    }

    @Override
    public String throwVerifiedBoxBackToClient() {
        System.out.println("Model : verified input box size by Model");
        for (BaseBox box : boxes) {
            if (box instanceof Box3) {
                if (((Box3) box).validate()) {
                    return "box3";
                } else {
                    continue;
                }
            } else if (box instanceof Box5) {
                if (((Box5) box).validate()) {
                    return "box5";
                } else {
                    return null;
                }
            }
        }
        return null;
    }

}
