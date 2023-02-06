import java.util.ArrayList;

public class Garage {
    ArrayList<MyVehicles> vehicles;

    public void addVehicle(MyVehicles vehicle){
        vehicles.add(vehicle);
    }
    public int sumVehiclesQuantity() {
        return vehicles.size();
    }

}
