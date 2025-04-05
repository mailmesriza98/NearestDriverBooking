package service;

import database.DriverDB;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class NearestDrivers {
    DriverDB db;

    public NearestDrivers(){
        db = new DriverDB();
    }
    public void update(String driver_id, int x, int y){
        db.update(driver_id, x , y);
    }

    public void getPoints(int pass_x, int pass_y, int maxradius){
        Map<String,Double> nearestDrivers = db.getPoints(pass_x, pass_y, maxradius);
        for(Map.Entry<String, Double> drivers: nearestDrivers.entrySet()){
            System.out.println(drivers.getKey() + " " + drivers.getValue());
        }
    }

    public void getPoints(int pass_x, int pass_y, int maxradius, int minradius){
        Map<String,Double> nearestDrivers = db.getPoints(pass_x, pass_y, maxradius, minradius);
        for(Map.Entry<String, Double> drivers: nearestDrivers.entrySet()){
            System.out.println(drivers.getKey() + " " + drivers.getValue());
        }
    }

    public void getPoints(int pass_x, int pass_y, int maxradius, int minradius, int maxlimit){

    }

}
