package com.sabel;

import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fenster_allesInEinerKlasse extends JFrame{

    private JPanel jPanelSouth;
    private JButton jbRed;
    private JButton jbGreen;
    private JButton jbBlue;

    private  JPanel jPanelWest;
    private JRadioButton rbRed;
    private JRadioButton rbGreen;
    private JRadioButton rbBlue;

    private JPanel jPanelCenter;

    private ButtonGroup buttonGroup;

    public Fenster_allesInEinerKlasse(){
       super("UebungBoxLayout");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(300,300);
       this.initComponents();
       this.initEvents();
       this.setVisible(true);

    }

    private void initEvents() {
        jbBlue.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelCenter.setBackground(Color.BLUE);
                rbBlue.setSelected(true);
            }
        });
        jbGreen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelCenter.setBackground(Color.GREEN);
                rbGreen.setSelected(true);
            }
        });
        jbRed.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelCenter.setBackground(Color.RED);
                rbRed.setSelected(true);
            }
        });

        //RadioButtons
        rbBlue.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelCenter.setBackground(Color.BLUE);
            }
        });
        rbGreen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelCenter.setBackground(Color.GREEN);
            }
        });
        rbRed.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelCenter.setBackground(Color.RED);
            }
        });
    }

    private void initComponents() {
        jPanelSouth = new JPanel();
        jbBlue = new JButton("Blue");
        jbGreen = new JButton("Green");
        jbRed = new JButton("Red");

        jPanelSouth.add(jbRed);
        jPanelSouth.add(jbGreen);
        jPanelSouth.add(jbBlue);

        rbBlue = new JRadioButton("Blue");
        rbGreen = new JRadioButton("Green");
        rbRed = new JRadioButton("Red", true);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbRed);
        buttonGroup.add(rbGreen);
        buttonGroup.add(rbBlue);

        jPanelWest = new JPanel();
        jPanelWest.add(rbRed);
        jPanelWest.add(rbGreen);
        jPanelWest.add(rbBlue);

        jPanelCenter = new JPanel();

        jPanelSouth.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanelWest.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        jPanelWest.setLayout(new BoxLayout(jPanelWest, BoxLayout.Y_AXIS));
        this.add(jPanelWest, BorderLayout.WEST);
        this.add(jPanelCenter);
        this.add(jPanelSouth, BorderLayout.SOUTH);
    }
}
