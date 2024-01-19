/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.summative;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import static java.awt.Color.WHITE;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rashi
 */
public class circle extends JPanel{
    private int x;
    private int y;
    private Color color;
    public circle(){
        setLayout(null);
        JTextField txt_fld = new JTextField();
        txt_fld.setBounds(90,1,400,30);
        add(txt_fld);
        String txt= txt_fld.getText();
        JButton btn = new JButton("Search");
        btn.addActionListener((ActionEvent e) -> {
            if (txt_fld.getText().equalsIgnoreCase("Canada")){
                x=100;
                y=300;
                color=RED;
                repaint();}
            else{
                x=100;
                y=300;
                color=BLUE;
                repaint();
            }
        });
        
        btn.setBounds(500,1,120,30);
        add(btn);
            
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.WHITE);
        g.setColor(Color.WHITE);
        g.setColor(color);
        g.fillOval(x,y, 30, 30);
        
        
        
    }
}
