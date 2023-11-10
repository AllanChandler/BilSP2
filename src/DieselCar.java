public class DieselCar extends AFuelCar {

    private final String fuelType;
    public boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int doors, int kmPrLitre, String fuelType, boolean particleFilter) {
        super(registrationNumber, make, model, doors, kmPrLitre);
        this.fuelType = fuelType;
        this.particleFilter = particleFilter;
    }

    public String getFuelType() {

        return this.fuelType;
    }

    public int getRegistrationFee() {

        if (kmPrLitre < 5 && particleFilter)  // car has a particleFilter which cost a registration fee of 1000
        {
            return 15260 + 1000;
        } else if (kmPrLitre < 10 && particleFilter) // if km/liter is between the given amount and 10 then it got a return value of 2770
        {
            return 2770 + 1000;
        } else if (kmPrLitre < 15 && particleFilter) // if km/liter is between the given amount and 10 then it got a return value of 1850
        {
            return 1850 + 1000;
        } else if (kmPrLitre < 20 && particleFilter) // if km/liter is between the given amount and 10 then it got a return value of 1390
        {
            return 1390 + 1000;
        } else if (kmPrLitre < 50 && particleFilter) { // if km/liter is between the given amount and 10 then it got a return value of 130
            return 130 + 1000;
        }

        if (kmPrLitre < 5) // the car has no particleFilter
        {
            return 15260;
        } else if (kmPrLitre < 10) // if km/liter is between the given amount and 10 then it got a return value of 2770
        {
            return 2770;
        } else if (kmPrLitre < 15) // if km/liter is between the given amount and 10 then it got a return value of 1850
        {
            return 1850;
        } else if (kmPrLitre < 20) // if km/liter is between the given amount and 10 then it got a return value of 1390
        {
            return 1390;

        } else // if km/liter is between the given amount and 50 then it got a return value of 130
        {
            return 130;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "Brand: " + getMake()
                + ", Model: " + getModel()
                + ", Number of Doors: " + getNumberOfDoors()
                + ", Number Plate: " + getRegistrationNumber()
                + ", Km/Liter: " + kmPrLitre + ", Fuel Type: " + getFuelType()
                + ", Particle filter status: " + particleFilter + "\n"
                + "Registration Fee: " + getRegistrationFee() + "\n";
    }
}
