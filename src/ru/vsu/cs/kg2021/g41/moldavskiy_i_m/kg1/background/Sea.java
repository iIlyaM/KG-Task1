package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import java.awt.*;

public class Sea {

    public static void drawSea(Graphics2D gr, int x, int y, int w, int h) {
        gr.setColor(Color.BLUE);
        gr.fillRect(x, y, w, h);
    }
}
