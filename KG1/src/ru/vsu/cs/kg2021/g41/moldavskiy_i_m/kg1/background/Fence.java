package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.DrawableObject;

import java.awt.*;

public class Fence extends DrawableObject {

    public Fence(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.darkGray);
        g.fillRect(x, y , this.width, this.height / 3);

        int leftBorder = 50;
        while (leftBorder < 1300) {
            g.setColor(Color.darkGray);
            g.fillRect(leftBorder, y, this.width / 20, this.height);
            g.setColor(Color.YELLOW);
            g.fillRect(leftBorder + 25, y + 25, this.width / 100, this.height / 15);
            leftBorder += 200;
        }
    }
}
