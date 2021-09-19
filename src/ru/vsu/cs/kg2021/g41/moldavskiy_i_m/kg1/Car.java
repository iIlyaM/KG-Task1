package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.RoundRectangle2D;

public class Car {

    public static void drawCar(Graphics2D gr, double x, double y, double w, double h,
                               double arcWidth, double arcHeight) {

        gr.setColor(new Color(47, 79, 79));
        gr.fill(new RoundRectangle2D.Double(x, y, w, h, arcWidth, arcHeight));
        gr.setColor(new Color(112, 128, 144));
        gr.fillArc((int)x + 20, (int)y + 55, 90, 90, 0, 180);
        gr.fillArc((int)x + 395, (int)y + 55, 90, 90, 0, 180);

        gr.setColor(Color.YELLOW);
        gr.fillArc((int)x + 474, (int)y - 20, 45, 45, 270, -90);

        gr.setColor(Color.BLACK);
        gr.fillOval((int)x + 30, (int)y + 60, 70, 70);
        gr.fillOval((int)x + 405, (int)y + 60, 70, 70);

        gr.setColor(new Color(47, 79, 79));
        gr.fillArc((int)x + 10, (int)y - 95, (int)w / 2, (int)h * 2, 0, 180);

        gr.setColor(new Color(30, 144, 255));
        gr.fill(new RoundRectangle2D.Double(x + 85, y - 65, w / 5, h / 1.6, arcWidth, arcHeight));

        gr.setColor(Color.BLACK);
        gr.drawLine((int)x + 85, (int)y + 5, (int)x + 85, (int)y + 60);
        gr.drawLine((int)x + 260, (int)y + 5, (int)x + 260, (int)y + 100);
        gr.drawArc((int)x + 395, (int)y + 55, 90, 90, 0, 180);
        gr.drawArc((int)x + 20, (int)y + 55, 90, 90, 0, 180);
        gr.drawArc((int)x + 10, (int)y - 95, (int)w / 2, (int)h * 2, 0, 180);
        gr.draw(new RoundRectangle2D.Double(x, y, w, h, arcWidth, arcHeight));
        gr.drawArc((int)x + 475, (int)y - 20, 45, 45, 270, -90);

    }
}
