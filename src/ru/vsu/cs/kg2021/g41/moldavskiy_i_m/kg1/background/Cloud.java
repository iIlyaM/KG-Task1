package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Cloud {

    public static void drawCloudTypeOne(Graphics2D gr, int x, int y, int rWidth, int rHeight) {
        Ellipse2D.Double e1 = new Ellipse2D.Double(x + rWidth * .30, y - rHeight * .3,
                rWidth * 1.55, rHeight * 0.9);
        Ellipse2D.Double e2 = new Ellipse2D.Double(x - rWidth * .20, y - rHeight * .3,
                rWidth * 1.25, rHeight * 0.9);
        Ellipse2D.Double e3 = new Ellipse2D.Double(x + rWidth * 1.50, y + rHeight * .250,
                rWidth * 0.75, rHeight * 0.5);
        Ellipse2D.Double e4 = new Ellipse2D.Double(x + rWidth * 2.25, y + rHeight * .400,
                rWidth * 0.45, rHeight * 0.25);
        gr.setColor(Color.WHITE);
        gr.fill(e1);
        gr.fill(e2);
        gr.fill(e3);
        gr.fill(e4);
    }

    public static void drawCloudTypeTwo(Graphics2D gr, int x, int y, int rWidth, int rHeight) {
        Ellipse2D.Double elp1 = new Ellipse2D.Double(x + rWidth *.35, y - rHeight * .2,
                rWidth * 1.75, rHeight * 1.4 );
        Ellipse2D.Double elp2 = new Ellipse2D.Double(x, y, rWidth, rHeight );
        Ellipse2D.Double elp3 = new Ellipse2D.Double(x + rWidth * 1.5, y + rHeight * .15,
                rWidth * .9, rHeight * .9 );
        gr.setColor(Color.WHITE);
        gr.fill(elp1);
        gr.fill(elp2);
        gr.fill(elp3);

    }
}
