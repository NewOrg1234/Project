/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.summative;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author rashi
 */
public class Layout extends JFrame {
    private static final int width= 737;
    private static final int height=824;
    
    public static void main(String[]args){
        JFrame frame = new JFrame("Map");
        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new circle());
        frame.setVisible(true);
        JLabel j1 = new JLabel();
        j1.setIcon(new ImageIcon("North_America_map.png"));
        j1.setVisible(true);
        j1.setBounds(1, 1, width, height);
        
        
     
       
        
    }
    
}
