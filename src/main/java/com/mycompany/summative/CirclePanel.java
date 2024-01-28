/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.summative;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author rashi
 */
public class CirclePanel extends JPanel {
    private boolean shouldDrawCircle = false;
    private int x;
    private int y;
    
    public void drawCircle(){
        shouldDrawCircle = true;
        repaint();
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(shouldDrawCircle){
            g.setColor(Color.RED);
            g.fillOval(x,y,15,15);
        }
    }
    
    public boolean isOpaque(){
        return false;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
