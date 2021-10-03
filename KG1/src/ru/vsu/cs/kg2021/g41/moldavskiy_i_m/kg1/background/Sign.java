package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.DrawableObject;

import java.awt.*;

public class Sign extends DrawableObject {

    public Sign(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.gray);
        g.fillRect(x , y, this.width, this.height);

        g.setColor(Color.WHITE);
        g.fillRect(x + 5 , y + 5, this.width - 10, this.height - 10);

        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        g.drawString("Владивосток", x + 15 , this.height + 45);
        g.drawString("3км", x + 55 , this.height + 65);

        g.setColor(new Color(51,51,51));
        g.fillRect(x + (this.width / 2), y + this.height , this.width / 10, this.height);


    }
}
