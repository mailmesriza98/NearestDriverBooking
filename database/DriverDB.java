package database;

import model.Driver;

import java.util.*;

public class DriverDB {

    HashMap<int[], String> driverPositions;
    public DriverDB(){
        driverPositions = new HashMap<>();
    }
    public void update(String driver_id, int x, int y){
        Driver driver = new Driver(driver_id, x, y);
        driverPositions.put(new int[]{x,y}, driver_id);
    }

    public Map<String, Double> getPoints(int pass_x, int pass_y, int maxradius){
        Map<String, Double> filteredDrivers = new HashMap<>();

        // Filter drivers within the min and max radius
        for (int[] position : driverPositions.keySet()) {
            int x = position[0];
            int y = position[1];

            double distance = Math.hypot(pass_x - x, pass_y - y);

            if (distance <= maxradius) {
                String driverName = driverPositions.get(position);
                filteredDrivers.put(driverName, distance);
            }
        }

        return filteredDrivers;
    }

    public Map<String, Double> getPoints(int pass_x, int pass_y, int maxradius, int minradius){
        Map<String, Double> filteredDrivers = new HashMap<>();

        // Filter drivers within the min and max radius
        for (int[] position : driverPositions.keySet()) {
            int x = position[0];
            int y = position[1];

            double distance = Math.hypot(pass_x - x, pass_y - y);

            if (distance >= minradius && distance <= maxradius) {
                String driverName = driverPositions.get(position);
                filteredDrivers.put(driverName, distance);
            }
        }

        return filteredDrivers;
    }

    public void getPoints(int pass_x, int pass_y, int maxradius, int minradius, int maxlimit){

    }
}
