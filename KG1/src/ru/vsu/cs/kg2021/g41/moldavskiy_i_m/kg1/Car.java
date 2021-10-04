package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Car extends DrawableObject {

    private double arcWidth;
    private double arcHeight;

    public Car(int x, int y, int width, int height, double arcWidth, double arcHeight) {
        super(x, y, width, height);
        this.arcWidth = arcWidth;
        this.arcHeight = height;
    }


    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(new Color(47, 79, 79));
        g.fill(new RoundRectangle2D.Double(x, y, w, h, arcWidth, arcHeight));
        g.setColor(new Color(112, 128, 144));
        g.fillArc((int)x + 20, (int)y + 55, 90, 90, 0, 180);
        g.fillArc((int)x + 395, (int)y + 55, 90, 90, 0, 180);

        g.setColor(Color.YELLOW);
        g.fillArc((int)x + 474, (int)y - 20, 45, 45, 270, -90);

        g.setColor(Color.BLACK);
        g.fillOval((int)x + 30, (int)y + 60, 70, 70);
        g.fillOval((int)x + 405, (int)y + 60, 70, 70);

        g.setColor(new Color(47, 79, 79));
        g.fillArc((int)x + 10, (int)y - 95, (int)w / 2, (int)h * 2, 0, 180);

        g.setColor(new Color(30, 144, 255));
        g.fill(new RoundRectangle2D.Double(x + 85, y - 65, w / 5, h / 1.6, arcWidth, arcHeight));

        g.setColor(Color.BLACK);
        g.drawLine((int)x + 85, (int)y + 5, (int)x + 85, (int)y + 60);
        g.drawLine((int)x + 260, (int)y + 5, (int)x + 260, (int)y + 100);
        g.drawArc((int)x + 395, (int)y + 55, 90, 90, 0, 180);
        g.drawArc((int)x + 20, (int)y + 55, 90, 90, 0, 180);
        g.drawArc((int)x + 10, (int)y - 95, (int)w / 2, (int)h * 2, 0, 180);
        g.draw(new RoundRectangle2D.Double(x, y, w, h, arcWidth, arcHeight));
        g.drawArc((int)x + 475, (int)y - 20, 45, 45, 270, -90);
    }
}
