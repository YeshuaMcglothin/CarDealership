package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle>Inventory;

    public Dealership(String name, String address, String phone){
        Inventory = new ArrayList<>();
    }


    public void getVehicleByPrice(int min, int max){
       for (Vehicle vehicle : Inventory ){
           if (min >= vehicle.getPrice() && max <= vehicle.getPrice()){
               System.out.println(vehicle);
           }
       }
    }

    public void getVehicleByYear(int min, int max){

    }
    public void getVehicleByMake(String make, String model){

    }

    public void getVehicleByVehicleType(String vehicleType){

    }

    public void getVehicleByColor(String color){

    }


    public void getVehicleByOdometer(int min, int max){

    }

    public void getAllVehicles(){
        System.out.println(Inventory);
    }

    public void addVehicles(){

    }

    public void removeVehicles(){

    }




}
