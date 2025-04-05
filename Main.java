import service.NearestDrivers;

public class Main {
    public static void main(String[] args){
        NearestDrivers nearestDrivers = new NearestDrivers();
        nearestDrivers.update("d1", 3,4);
        nearestDrivers.update("d2", 4,5);
        nearestDrivers.update("d3", 2,3);
        nearestDrivers.update("d2", 4,7);
        nearestDrivers.update("d2", 3,5);

        nearestDrivers.getPoints(1,2,2);
        nearestDrivers.getPoints(5,6,2);
        nearestDrivers.getPoints(2,3,5,2);
    }
}
