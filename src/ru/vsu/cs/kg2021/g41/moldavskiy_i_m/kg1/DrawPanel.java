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

        World world = new World();
        world.paint(gr);
    }
}
