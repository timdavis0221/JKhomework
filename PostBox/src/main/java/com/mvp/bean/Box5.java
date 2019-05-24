package com.mvp.bean;

public class Box5 extends BaseBox {

    private final float length = 39.5f;
    private final float width = 27.5f;
    private final float height = 23f;

    public Box5(float length, float width, float height) {
        super(length, width, height);
    }

    @Override
    public boolean validate() {
        float totalOfBox5 = length + width + height;
        float inputOfBox5 = getLength() + getWidth() + getHeight();

        if (getLength() > length || getWidth() > width || getHeight() > height)
            return false;
        else if (inputOfBox5 <= totalOfBox5) {
            return true;
        } else
            return true;
    }

}
