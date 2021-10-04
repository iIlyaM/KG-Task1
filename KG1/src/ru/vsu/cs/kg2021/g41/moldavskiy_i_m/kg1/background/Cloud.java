package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.DrawableObject;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Cloud extends DrawableObject {

    public Cloud(int x, int y, int width, int height) {
        super(x, y, width, height);
    }


    @Override
    public void draw(Graphics2D g, int w, int h) {
        Ellipse2D.Double e1 = new Ellipse2D.Double(x + this.width * .30, y - this.height * .3,
                this.width * 1.55, this.height * 0.9);
        Ellipse2D.Double e2 = new Ellipse2D.Double(x - this.width * .20, y - this.height * .3,
                this.width * 1.25, this.height * 0.9);
        Ellipse2D.Double e3 = new Ellipse2D.Double(x + this.width * 1.50, y + this.height * .250,
                this.width * 0.75, this.height * 0.5);
        Ellipse2D.Double e4 = new Ellipse2D.Double(x + this.width * 2.25, y + this.height * .400,
                this.width * 0.45, this.height * 0.25);
        g.setColor(Color.WHITE);
        g.fill(e1);
        g.fill(e2);
        g.fill(e3);
        g.fill(e4);
    }
}
