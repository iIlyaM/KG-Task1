package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1;

import java.awt.*;

public abstract class DrawableObject {
    protected int x, y, width, height;

    public DrawableObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void draw(Graphics2D g, int w, int h);
}
