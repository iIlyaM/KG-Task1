package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import java.awt.*;

public class Sky {

    public static void drawSky(Graphics2D gr, int x, int y, int w, int h) {
        gr.setColor(Color.CYAN);
        gr.fillRect(x, y, w, h);
    }
}
