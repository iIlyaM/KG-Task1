package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background;

import ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.DrawableObject;

import java.awt.*;
import java.util.ArrayList;

public class Road extends DrawableObject {

    private final ArrayList<RoadMark> marks = new ArrayList<>();
    private final ArrayList<Fence> fence = new ArrayList<>();

    public Road(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.marks.add(new RoadMark(x + 200, y , width , height ));
        this.marks.add(new RoadMark(x + 600, y , width , height ));
        this.marks.add(new RoadMark(x + 1000, y , width , height ));
        this.fence.add(new Fence(x, y, width, height));
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, w, h);

        for (RoadMark i: marks) {
            i.draw(g, w, h);
        }

    }
}
