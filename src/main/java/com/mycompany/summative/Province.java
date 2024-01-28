/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.summative;

import java.util.ArrayList;

/**
 *
 * @author rashi
 */
public class Province
  {
    public String name;
    public int population;
    public int area;
    public double latitude;
    public double longitude;
    public ArrayList<Province> allProvinces = new ArrayList<Province>();
 
    //
 
    public Province(String provName, int provPopulation, int provArea, double provLatitude, double provLongitude)
    {
      name = provName;
      population = provPopulation;
      area = provArea;
      latitude = provLatitude;
      longitude = provLongitude;
      allProvinces.add(this);
    }
    public Province()
    {
      allProvinces.add(this);
    }
    public String getName()
    {
      return name;
    }
    public int getPopulation()
    {
      return population;
    }
    public int getArea()
    {
      return area;
    }
    public double getLatitude()
    {
      return latitude;
    }
    public double getLongitude()
    {
      return longitude;
    }
    //
    public void setName(String newName)
    {
      name = newName;
    }
    public void setPopulation(int newPopulation)
    {
      population = newPopulation;
    }
    public void setArea(int newArea)
    {
      area = newArea;
    }
    public void setLatitude(double newLatitude)
    {
      latitude = newLatitude;
    }
    public void setLongitude(double newLongitude)
    {
      longitude = newLongitude;
    }
    //
    public void loadProvinces()
    {
      Province alberta = new Province("Alberta", 4262635, 661848, 53.9333, -116.5765);
      Province britishColumbia = new Province("British Columbia", 5000879, 944735, 53.7267, -127.6476);
      Province manitoba = new Province("Manitoba", 1342153, 1342153, 53.7609, -98.8139);
      Province newBrunswick = new Province("New Brunswick", 775610, 72908, 46.5653, -66.4619);
      Province newfoundlandAndLabrador = new Province("Newfoundland and Labrador", 510550, 405212, 53.1355, -57.6604);
      Province novaScotia = new Province("Nova Scotia", 969383, 55284, 44.6810, -63.7443);
      Province ontario = new Province("Ontario", 1422394, 1076395, 51.2538, -85.3232);
      Province princeEdwardIsland = new Province("Prince Edward Island", 154331, 5660, 46.5107, -63.4168);
      Province quebec = new Province("Quebec", 8501833, 1542056, 52.9399, -73.5491);
      Province saskatchewan = new Province("Saskatchewan", 1132505, 651036, 52.9399, -106.4509);
    }
  }
