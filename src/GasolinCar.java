public class GasolinCar extends AFuelCar {
    private final String fuelType;

    public GasolinCar(String registrationNumber, String make, String model, int doors, int kmPrLitre, String fuelType) {
        super(registrationNumber, make, model, doors, kmPrLitre);
        this.fuelType = fuelType;

    }


    public int getRegistrationFee() {
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

    public String getFuelType() {
        return this.fuelType;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Brand: " + getMake()
                + ", Model: " + getModel()
                + ", Number of Doors: " + getNumberOfDoors()
                + ", Number Plate: " + getRegistrationNumber()
                + ", Km/Liter: " + kmPrLitre
                + ", Fuel Type: " + getFuelType()
                + "\n" + "Registration Fee: " + getRegistrationFee() + "\n";
    }
}
