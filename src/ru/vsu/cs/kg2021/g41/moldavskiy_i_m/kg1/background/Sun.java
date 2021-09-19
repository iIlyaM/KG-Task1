package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import java.awt.*;

public class Sun {

    public static void drawSun(Graphics2D g, int x, int y, int rInner, int rOuter, int n, Color c) {
        Color oldC = g.getColor();
        g.setColor(c);

        g.fillOval(x - rInner, y - rInner, rInner * 2, rInner * 2);
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = da * i;
            double x1 = x + rInner * Math.cos(a);
            double y1 = y + rInner * Math.sin(a);
            double x2 = x + rOuter * Math.cos(a);
            double y2 = y + rOuter * Math.sin(a);
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }

        g.setColor(oldC);
    }
}
