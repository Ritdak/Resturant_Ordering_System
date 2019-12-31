/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.GridLayout;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.event.*;

        

/**
 *
 * @author Dimka
 */

class FoodRestaurant extends Landing {
    public String Restaurant;
    public String[] Foods;
    
    FoodRestaurant(String[] Foods, String Restuarant) {
        this.Foods = Foods;
        this.Restaurant = Restuarant;
    }
}

public class Food {
    public FoodRestaurant[] FOODS = {
        new FoodRestaurant( new String[] { " Rice" , " Beans", " Beans", " Beans", " Beans", " Beans", }, "Omega" ),
        new FoodRestaurant( new String[] { " Amala", " Eba"}, "Ngozika" ),
        new FoodRestaurant( new String[] { " Akara", "Moin-Moin"}, "Davta" ),
        new FoodRestaurant( new String[] { " Cous Cous", " Pounded Yam"}, "ETC" ),
        new FoodRestaurant( new String[] { " Corn Flakes"," Golden Morn "}, "Rairom" ), 
       
    };
   
   
    JFrame mainFrame;
    JPanel mainPanel;
    JPanel innerPanel;
    JLabel header;
    JList <String> leftlist;
    private List<String> forList;
    private JList rightlist;
    private JButton buyButton;
    private double itemPrice;
    private double quantity;
    double mainPrice = 0;
    Object new_list;
    
    private Icon[] Foods; 
    
    
    public Food(String restaurantName) {
        FoodRestaurant foodRestaurant;
        
        for (int i = 0; i < FOODS.length; i++) {
            if (FOODS[i].Restaurant == restaurantName) {
                foodRestaurant = FOODS[i];
                 
                mainFrame = new JFrame(foodRestaurant.Restaurant);
                mainPanel = new JPanel();

                mainPanel.setLayout(new GridLayout(2, 1));

                innerPanel = new JPanel();
                header = new JLabel("Select a meal");
                

                innerPanel.setLayout(new GridLayout(2, 3));

               leftlist = new JList <String>(foodRestaurant.Foods);
               leftlist.setVisibleRowCount(3);
               leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
               innerPanel.add(new JScrollPane(leftlist));
               
               JButton buyButton = new JButton("buy");
               buyButton.addActionListener(
               new ActionListener(){
                  public void actionPerformed(ActionEvent event){
                  
                   forList = leftlist.getSelectedValuesList();
                  // JOptionPane.showMessageDialog(null, forList);
                   for(int i =0; i <forList.size(); i++){
                     mainPrice += itemPrice(forList.get(i));
                   }
                    JOptionPane.showMessageDialog(null, mainPrice+"");
                    //innerPanel.add(jtextfield);
                    
                  }
                  
               }
               );
               innerPanel.add(buyButton);
               

                mainPanel.add(header, "Center");
                mainPanel.add(innerPanel);
                mainFrame.getContentPane().add(mainPanel, "Center"); // Paste MyPanel into JFrame    

                mainFrame.setSize(700, 500);
                mainFrame.setVisible(true);
                break;
            }
        }
        
    }
   private  double itemPrice(String foodItem){
    if (foodItem.equals("Rice")){
    itemPrice = 2.00 * quantity(foodItem);
    }
    if (foodItem.equals("Beans")){
    
    itemPrice = 50.00 * quantity(foodItem);
    }
    if (foodItem.equals("Amala")){
    
    itemPrice = 300.00 * quantity(foodItem);
    }
    if (foodItem.equals("eba")){
    
    itemPrice = 150.00 * quantity(foodItem);
    }
    if (foodItem.equals("Akara")){
   
    itemPrice = 100.00 * quantity(foodItem);
    }
    if (foodItem.equals("Moin-Moin")){
     
     itemPrice = 55.00 * quantity(foodItem);
    }
    if (foodItem.equals("Cous Cous")){
    
     itemPrice = 45.67 * quantity(foodItem);
    }
    if (foodItem.equals("Pounded Yam")){
     
     itemPrice = 60.07 * quantity(foodItem);
    }
    if (foodItem.equals("Corn Flakes")){
     
     itemPrice = 105.00 * quantity(foodItem);
    }
    if (foodItem.equals("Golden Morn")){
     
     itemPrice = 99.99 * quantity(foodItem);
    }
        return itemPrice;
    
    }
   private double quantity(String foodItem){
   String message = JOptionPane.showInputDialog("quantity?" );
   int quantity = Integer.parseInt(message);
        return quantity;
   
   }
    
  public static void main(String[] args) {
        
    }

   
      
}

