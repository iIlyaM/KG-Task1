package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1;

import ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1.background.*;

import java.awt.*;

public class World {
    private Sun sun;
    private Sky sky;
    private Cloud cloud;
    private Sea sea;
    private Road road;
    private Grass grass;
    private Car car;
    private Sign sign;
    private Fence fence;

    public World() {
        sky = new Sky(0, 0, 1300, 150);
        sun = new Sun(100,50, 80,80,20, 55, 13, Color.ORANGE);
        cloud = new Cloud(200, 50, 100, 50);
        sea = new Sea(0, 150, 1300, 200);
        road = new Road(0, 350, 1300, 250);
        sign = new Sign(950, 120, 150, 120);
        fence = new Fence(0, 275, 1300, 90);
        car = new Car(100, 430, 500, 100, 25, 25);
        grass = new Grass(0, 600, 1300, 600);
    }

    public void paint(Graphics2D gr) {

        sky.draw(gr, 1300, 150);

        cloud.draw(gr,100, 50);

        sea.draw(gr, 1300, 200);

        road.draw(gr, 1300, 250);

        sign.draw(gr, 150, 120);

        fence.draw(gr, 1300, 90);

        car.draw(gr, 500,100);

        sun.draw(gr,0,0);

        grass.draw(gr, 1300, 600);
    }
}
