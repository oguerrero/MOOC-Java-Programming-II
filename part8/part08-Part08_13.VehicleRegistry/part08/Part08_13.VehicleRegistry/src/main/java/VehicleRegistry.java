import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.owners.containsKey(licensePlate)) {
            return false;
        }

        this.owners.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.owners.containsKey(licensePlate)) {
            return false;
        }

        this.owners.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.owners.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : this.owners.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }

        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
