package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame{

    private JPanel jpWest, jpSouth, jpCenter, jpNorth;
    private JButton jbtRed, jbtGreen, jbtBlue;
    private JRadioButton jRadioButtonRed, jRadioButtonGreen, jRadioButtonBlue;
    private String[] items = {"Red", "Green", "Blue"};
    private JComboBox jComboBox;

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
        this.jbtRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red();
            }
        });
        this.jbtGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green();
            }
        });
        this.jbtBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blue();
            }
        });

        //RadioButtons EventHandling
        this.jRadioButtonBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blue();
            }
        });

        this.jRadioButtonGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green();
            }
        });

        this.jRadioButtonRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red();
            }
        });
    }

    private void red() {
        jpCenter.setBackground(Color.RED);
        jRadioButtonRed.setSelected(true);
    }

    private void green() {
        jpCenter.setBackground(Color.GREEN);
        jRadioButtonGreen.setSelected(true);
    }

    private void blue() {
        jpCenter.setBackground(Color.BLUE);
        jRadioButtonBlue.setSelected(true);
    }

    private void initialComponents() {
        //RadioButtons
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

        //JButton
        jpSouth = new JPanel();
        jbtBlue = new JButton("Blue");
        jbtGreen = new JButton("Green");
        jbtRed = new JButton("Red");
        jpSouth.add(jbtRed);
        jpSouth.add(jbtGreen);
        jpSouth.add(jbtBlue);

        jpCenter = new JPanel();
        jpCenter.setBackground(Color.RED);

        //ComboBox
        jpNorth = new JPanel();
        jComboBox = new JComboBox(items);
        jComboBox.setSelectedIndex(0);
        jpNorth.add(jComboBox);

        //Windows Position
        this.add(jpNorth, BorderLayout.NORTH);
        this.add(jpWest, BorderLayout.WEST);
        this.add(jpCenter, BorderLayout.CENTER);
        this.add(jpSouth, BorderLayout.SOUTH);
    }

    public static void main(String[]args){
        new Fenster();

    }
}

