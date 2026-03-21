abstract class Device {
    protected String brand;

    public Device(String brand){
        this.brand=brand;
    }
    abstract void turnOn(); 
}
interface RemoteControllable {
    void connectToWifi();
}
interface PowerSaving {
    void getEnergyRating();
}
class SmartTV extends Device implements RemoteControllable, PowerSaving {
    public SmartTV(String brand){
        super(brand);
    }
    @Override
    void turnOn(){
        System.out.println(brand + " TV is booting up...");
    }
    @Override
    public void connectToWifi(){
        System.out.println("Connecting to Home_5G...");
    }
    @Override
    public void getEnergyRating(){
        System.out.println("Energy Rating: 5 Star");
    }
}
class ElectricKettle extends Device {
    public ElectricKettle(String brand){
        super(brand);
    }
    @Override
    void turnOn(){
        System.out.println(brand + " Kettle is heating water...");
    }
}
public class case2 {
    public static void main(String[] args) {

        Device d = new SmartTV("Sony");
        d.turnOn();   
        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();
         //r.turnOn();  // ERROR 
        PowerSaving p = new SmartTV("Samsung");
        p.getEnergyRating();
    }
}