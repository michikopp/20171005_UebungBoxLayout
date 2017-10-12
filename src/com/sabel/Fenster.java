package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame{

    private JPanel jpWest, jpSouth, jpCenter;
    private JButton jbtRed, jbtGreen, jbtBlue;
    private JRadioButton jRadioButtonRed, jRadioButtonGreen, jRadioButtonBlue;

    public Fenster() {
        super("Übung Farbenspiel");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.initialComponents();
        this.initEvents();
        //this.setSize(300, 300);
        this.pack();
        this.setVisible(true);
    }

    private void initEvents() {
        MyActionListener malr = new MyActionListener(jpCenter, jRadioButtonRed);
        jRadioButtonRed.addActionListener(malr);
        jbtRed.addActionListener(malr);

    }


    private void initialComponents() {
        jpWest = new JPanel();
        jpWest.setLayout(new BoxLayout(jpWest, BoxLayout.Y_AXIS));
        jRadioButtonRed = new JRadioButton("Red");
        jRadioButtonRed.setSelected(true);
        jRadioButtonGreen = new JRadioButton("Green");
        jRadioButtonBlue = new JRadioButton("Blue");
        jpWest.add(jRadioButtonBlue);
        jpWest.add(jRadioButtonGreen);
        jpWest.add(jRadioButtonRed);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonBlue);
        bg.add(jRadioButtonGreen);
        bg.add(jRadioButtonRed);

        jpSouth = new JPanel();
        jbtBlue = new JButton("Blue");
        jbtGreen = new JButton("Green");
        jbtRed = new JButton("Red");
        jpSouth.add(jbtRed);
        jpSouth.add(jbtGreen);
        jpSouth.add(jbtBlue);

        jpCenter = new JPanel();
        //jpCenter.setBackground(Color.RED);


        this.add(jpWest, BorderLayout.WEST);
        this.add(jpCenter, BorderLayout.CENTER);
        this.add(jpSouth, BorderLayout.SOUTH);
    }

    public static void main(String[]args){
        new Fenster();

    }
}

