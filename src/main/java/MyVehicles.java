public abstract class MyVehicles {

    protected String make;
    protected String transmission;
    protected int numWheels;
    protected int numPassengers;

    public MyVehicles(String make, String transmission, int numWheels, int numPassengers){
        this.make = make;
        this.transmission = transmission;
        this.numWheels = numWheels;
        this.numPassengers= numPassengers;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

}
