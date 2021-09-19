package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1;

import java.awt.*;

public class Road {

    public static void drawRoad(Graphics2D gr, int x, int y, int w, int h) {
        gr.setColor(Color.GRAY);
        gr.fillRect(x, y, w, h);

        gr.setColor(Color.WHITE);
        gr.fillRect(x + 200, y + h / 2, w / 15, h / 15);
        gr.fillRect(x + 600, y + h / 2, w / 15, h / 15);
        gr.fillRect(x + 1000, y + h / 2, w / 15, h / 15);
    }
}
