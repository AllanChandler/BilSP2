public class ElectricCar extends ACar {

    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int doors, int batteryCapacityInWh, int maxRange) // constructor
    {
        super(registrationNumber, make, model, doors);
        this.batteryCapacity = batteryCapacityInWh;
        this.maxRange = maxRange;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }


    public int getWhPrKm() {
        return (getBatteryCapacityKWh() * 1000) / getMaxRangeKm(); // setting my return type to int and dividing my kilowatt/hour with 91.25 and then with 100
    }

    public int getRegistrationFee() {
        float kmPrLitre = 100 / (getWhPrKm() / 91.25f);
        if (kmPrLitre < 5) {
            return 10470;
        } else if (kmPrLitre < 10) {
            return 5500;
        } else if (kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre < 20) {
            return 1050;
        } else {
            return 330;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + "Brand: " + getMake()
                + ", Model: " + getModel()
                + ", Number of Doors: " + getNumberOfDoors()
                + ", Number Plate: " + getRegistrationNumber()
                + ", Km/Liter: " + getWhPrKm()
                + ", Fuel Type: Electric"
                + "\n"
                + "Registration Fee: " + getRegistrationFee()
                + "\n";
    }
}