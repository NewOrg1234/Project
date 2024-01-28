/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.summative;

/**
 *
 * @author morgana
 * @author alleena
 */
import java.util.ArrayList;
 
public class Territory extends Province {
  public ArrayList<Territory> allTerritories = new ArrayList<>();

  public Territory(String terName, int terPopulation, int terArea, double terLatitude, double terLongitude) {
    name = terName;
    population = terPopulation;
    area = terArea;
    latitude = terLatitude;
    longitude = terLongitude;
    allTerritories.add(this);
  }

  public void loadTerritories() {
    Territory northwestTerritories = new Territory("Northwest Territories", 41070, 1346106, 64.8255, -124.8457);
    Territory nunavut = new Territory("Nunavut", 36858, 2093190, 70.2998, -83.1076);
    Territory yukon = new Territory("Yukon", 40232, 482443, 64.2823, -13);
  }
}
 
 
 
 
 
