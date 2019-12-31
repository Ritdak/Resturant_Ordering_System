/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dimka
 */
class drinkRestaurant extends Landing{
    public String Restaurant;
    public String[] drinks;
    
    drinkRestaurant(String[] drinks, String Restuarant) {
        this.drinks = drinks;
        this.Restaurant = Restuarant;
    }
}
public class drink {
    public drinkRestaurant[] DRINKS = {
        new drinkRestaurant( new String[] { "Coca-cola", "fanta"}, "Omega" ),
        new drinkRestaurant( new String[] { "Pepsi", "Mirinda"}, "Ngozika" ),
        new drinkRestaurant( new String[] { "Shcweppes", "Team"}, "Davta" ),
        new drinkRestaurant( new String[] { "la-casera", "farouz"}, "ETC" ),
        new drinkRestaurant( new String[] { "Capri-sonne", "Ribenna"}, "Rairom" ), 
    };

    JFrame mainFrame;
    JPanel mainPanel;
    JPanel innerPanel;
    JLabel header;
    
    public drink(String restaurantName) {
        drinkRestaurant drinkRestaurant;
        
        for (int i = 0; i < DRINKS.length; i++) {
            if (DRINKS[i].Restaurant == restaurantName) {
                drinkRestaurant = DRINKS[i];
                
                mainFrame = new JFrame(drinkRestaurant.Restaurant);
                mainPanel = new JPanel();

                mainPanel.setLayout(new GridLayout(2, 1));

                innerPanel = new JPanel();
                header = new JLabel("Select a Drink");

                innerPanel.setLayout(new GridLayout(2, 3));

                for (int j = 0; j < drinkRestaurant.drinks.length; j++) {
                    innerPanel.add(new JButton(drinkRestaurant.drinks[j]));
                    
                }

                mainPanel.add(header, "Center");
                mainPanel.add(innerPanel);
                mainFrame.getContentPane().add(mainPanel, "Center"); // Paste MyPanel into JFrame    

                mainFrame.setSize(700, 500);
                mainFrame.setVisible(true);
                break;
            }
        }
    }
}
