/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author DONY-SAMDHILA
 */
public class Truck {
    //the truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    //the truck class has one constructor
    public Truck (int startCadence, int startSpeed, int startGear)
    {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    //the truck class has four methods
    public void setCadence (int newValue)
    {
        cadence = newValue;
    }
    public void setGear (int newValue)
    {
        gear = newValue;
    }
    public void applybrake (int decrement)
    {
        speed = decrement;
    }
    public void SpeedUp (int increment)
    {
        speed = increment;
    }
}
