package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.DrawableObject;

import java.awt.*;

public class RoadMark extends DrawableObject {

    public RoadMark(int x, int y, int width, int height) {
        super(x, y + height / 2, width / 10, height / 15);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.WHITE);
        g.fillRect(x , y, this.width, this.height);
    }
}
