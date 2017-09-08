/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_5;

/**
 *
 * @author SMK TELKOM
 */
public class Truck {
    public int cadence;
    public int gear;
    public int speed;
    //kontruktor
    public Truck(int startCadence,int startSpeed,int startGear, int StartCadence){
        cadence=StartCadence;
        gear=startGear;
        speed=startSpeed;
    }
    //the truck class has four methods
    public void setCadence(int newValue){
        cadence=newValue;
    }
    public void setGear(int newValue){
        gear=newValue;
    }
    public void applybrake(int decrement){
        speed=decrement;
    }
    public void speedUp(int increment){
        speed=increment;
    }
}
