package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.DrawableObject;

import java.awt.*;

public class Sea extends DrawableObject {

    public Sea(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, this.width, this.height);
    }
}
