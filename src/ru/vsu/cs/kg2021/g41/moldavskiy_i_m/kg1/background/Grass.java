package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import java.awt.*;

public class Grass {

    public static void drawGrass(Graphics2D gr, int x, int y, int w, int h) {
        gr.setColor(Color.green);
        gr.fillRect(x, y, w, h);
    }
}
