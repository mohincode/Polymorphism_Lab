public class Car extends MyVehicles {

    public boolean hasRadio;
    public boolean hasBoot;

    public Car(String make, String transmission, int numWheels, int numPassengers) {
        super(make, transmission, numWheels, numPassengers);
        this.numPassengers = 7;
        this.numWheels = 4;
    }

    public boolean isHasRadio() {
        return hasRadio;
    }

    public void setHasRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }

    public boolean isHasBoot() {
        return hasBoot;
    }

    public void setHasBoot(boolean hasBoot) {
        this.hasBoot = hasBoot;
    }


}
