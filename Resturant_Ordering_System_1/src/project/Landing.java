/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author Dimka
 */
public class Landing {
    public String[] RESTAURANTS = { "Omega", "Ngozika", "Davta", "ETC", "Rairom" };
    JFrame mainFrame;
    JPanel mainPanel;
    JPanel innerPanel;
    JLabel header;
    

    public Landing() {
        mainFrame = new JFrame("Restaurant App");
        mainPanel = new JPanel();
        
        mainPanel.setLayout(new GridLayout(2, 1));
        
        innerPanel = new JPanel();
        header = new JLabel("Select a Restaurant");
        
        innerPanel.setLayout(new GridLayout(2, 3));
        
        for (int i = 0; i < RESTAURANTS.length; i++) {
            JButton button = new JButton(RESTAURANTS[i]);
            final String restaurant = RESTAURANTS[i];
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new Food(restaurant);
                }
            });
            innerPanel.add(button);
        }
        
        mainPanel.add(header, "Center");
        mainPanel.add(innerPanel);
        mainFrame.getContentPane().add(mainPanel, "Center"); // Paste MyPanel into JFrame    
    
   	mainFrame.setSize(700, 500);
   	mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Landing();
    }
    
    
    
}
