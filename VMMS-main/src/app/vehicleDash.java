/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Carl
 */
class vehicleDash {
    private final String vehicle;
    private final String plate;
    private final String odometer;
    
    public vehicleDash(String vehicle, String plate, String odometer){
        this.vehicle=vehicle;
        this.plate=plate;
        this.odometer=odometer;
    }
    public String getVehicle(){
        return vehicle;
    }
    public String getPlate(){
        return plate;
    }
    public String getOdometer(){
        return odometer;
    }
}
