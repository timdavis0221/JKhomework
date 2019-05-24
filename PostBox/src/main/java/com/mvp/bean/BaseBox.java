package com.mvp.bean;

public abstract class BaseBox {
    private float length;
    private float width;
    private float height;

    protected BaseBox(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    protected abstract boolean validate();
}
