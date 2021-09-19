package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1;

import ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public DrawPanel() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;

        Sky.drawSky(gr, 0, 0, 1300, 150);
        Cloud.drawCloudTypeOne(gr, 200, 50, 100, 50);
        Cloud.drawCloudTypeTwo(gr, 700, 45, 80, 35);
        Sea.drawSea(gr, 0, 150, 1300, 200);
        Road.drawRoad(gr, 0, 350, 1300, 250);
        Car.drawCar(gr, 100, 430, 500, 100, 25, 25);
        Sun.drawSun(gr, 100, 50, 20, 55, 13, Color.ORANGE);
        Grass.drawGrass(gr, 0, 600, 1300, 600);
    }
}
