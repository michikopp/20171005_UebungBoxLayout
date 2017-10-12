package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

    private JPanel jPanel;
    private JRadioButton jRadioButton;

    public MyActionListener(JPanel jPanel, JRadioButton jRadioButton) {
        this.jPanel = jPanel;
        this.jRadioButton = jRadioButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jPanel.setBackground(Color.RED);
        jRadioButton.setSelected(true);
    }
}

