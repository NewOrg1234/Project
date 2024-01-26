/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.summative;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author rashi
 */
public class Layout extends JFrame {

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    private static final int width = 750;
    private static final int height = 824;
    private CirclePanel circlePanel;
    private int x;
    private int y;
    
    public Layout(){
        setTitle("Map");
        setSize(new Dimension(width, height));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel controlPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0,50,0,5);
        
        GridBagConstraints gtbc = new GridBagConstraints();
        gtbc.insets = new Insets(0,100,0,0);
        
        JTextField textField = new JTextField(24);
        JButton drawButton = new JButton("Draw circle");
        drawButton.addActionListener((ActionEvent e) -> {
            if (textField.getText().equalsIgnoreCase("Canada")){
                circlePanel.setX(100);
                circlePanel.setY(100);
                circlePanel.drawCircle();
            }
            else if(textField.getText().equalsIgnoreCase("Something")){
                circlePanel.setX(600);
                circlePanel.setY(600);
                circlePanel.drawCircle();
            }
            else{
                circlePanel.setX(440);
                circlePanel.setY(440);
                circlePanel.drawCircle();
                JOptionPane.showMessageDialog(this, "Country not recognized, default position set.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
            
        });
          
          
          gtbc.gridx = 0; // Set the gridx position for the text field
         gtbc.gridy = 0; // Set the gridy position
         controlPanel.add(textField, gtbc);
        
         // Adding drawButton to the controlPanel
         
        
        gbc.gridx= 1;
        gbc.gridy=0;
        controlPanel.add(drawButton,gbc);
        circlePanel = new CirclePanel();
        JLabel lb = new JLabel(new ImageIcon("C:\\Users\\rashi\\Downloads\\North_America_map.png"));
        getContentPane().add(lb, BorderLayout.CENTER);
        getContentPane().add(controlPanel, BorderLayout.SOUTH);
        getLayeredPane().add(circlePanel,JLayeredPane.PALETTE_LAYER);
        circlePanel.setBounds(0,0,width,height);
        pack();
        
        setVisible(true);
        
        }
        public static void main(String[]args){
            SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run(){
                    new Layout();
                }
            });
        }

}
    

