package app;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Vehicle {
    private int vehicleID;
    private String vehicleName;
    private String vehicleModel;
    private int odemeter;

    public Vehicle(int vehicleID, String vehicleName, String vehicleModel, int odemeter) {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.vehicleModel = vehicleModel;
        this.odemeter = odemeter;
    }

    public Vehicle(String vehicleName, String vehicleModel, int odemeter) {
        this.vehicleName = vehicleName;
        this.vehicleModel = vehicleModel;
        this.odemeter = odemeter;
    }
    //Setters

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }
    public void setVehicleName(String vehicleName) {
        while (vehicleName == " "){
            
        }
        this.vehicleName = vehicleName;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public void setOdemeter(int odemeter) {
        this.odemeter = odemeter;
    }
    
    //Getters
    public int getVehicleID() {return vehicleID;}
    public String getVehicleName() {return vehicleName;}
    public String getVehicleModel() {return vehicleModel;}
    public int getOdemeter() {return odemeter;}
    
       
}
