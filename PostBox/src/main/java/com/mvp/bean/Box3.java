package com.mvp.bean;

public class Box3 extends BaseBox {

    private final float length = 23f;
    private final float width = 14f;
    private final float height = 13f;

    public Box3(float length, float width, float height) {
        super(length, width, height);
    }

    @Override
    public boolean validate() {
        float totalOfBox3 = length + width + height;
        float inputOfBox3 = getLength() + getWidth() + getHeight();

        if (getLength() > length || getWidth() > width || getHeight() > height)
            return false;
        else if (inputOfBox3 <= totalOfBox3) {
            return true;
        } else
            return true;
    }

}
