package ru.vsu.cs.kg2021.g41.moldavskiy_i_m.kg1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private final DrawPanel dp;

    public MainWindow() throws HeadlessException {
        dp = new DrawPanel();
        add(dp);
    }
}
