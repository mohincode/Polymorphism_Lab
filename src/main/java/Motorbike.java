public class Motorbike extends MyVehicles {
    public Motorbike(String make, String transmission, int numWheels, int numPassengers) {
        super(make, transmission, numWheels, numPassengers);
        this.numPassengers = 2;
        this.numWheels = 2;
    }

    public String dodgeTraffic(){
        return "Just saved twenty minutes";
    }

    public String wheelie() {
        return "what a daredevil";
    }

}
