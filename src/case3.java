import java.util.*;
abstract class Transport {
    protected String trackingId;
    protected String destination;

    public Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }
    abstract void dispatch(); 
}
interface GPS {
    void getCoordinates();
}
interface Autonomous {
    void selfNavigate();
}
class DeliveryDrone extends Transport implements GPS, Autonomous {

    public DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }
    @Override
    void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }
    @Override
    public void getCoordinates() {
        System.out.println("40.7128° N, 74.0060° W");
    }
    @Override
    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}
class Truck extends Transport {

    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }
    @Override
    void dispatch() {
        System.out.println("Truck " + trackingId + " leaving warehouse...");
    }
}
class CargoShip extends Transport {

    public CargoShip(String trackingId, String destination) {
        super(trackingId, destination);
    }
    @Override
    void dispatch() {
        System.out.println("Cargo Ship " + trackingId + " sailing...");
    }
}
public class case3 {
    public static void main(String[] args) {
        Transport t = new DeliveryDrone("D101", "New York");
        t.dispatch();
        GPS g = new DeliveryDrone("D101", "New York");
        g.getCoordinates();
        if (t instanceof GPS) {
            System.out.println("t supports GPS");
            ((GPS) t).getCoordinates(); 
        }
        List<Transport> list = new ArrayList<>();
        list.add(new DeliveryDrone("D102", "London"));
        list.add(new Truck("T201", "Delhi"));
        list.add(new CargoShip("S301", "Dubai"));

        for (Transport tr : list) {
            tr.dispatch(); 
        }
    }
}