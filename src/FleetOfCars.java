import java.util.ArrayList;

public class FleetOfCars {
    private final ArrayList<Car> Fleet;

    public FleetOfCars() {

        Fleet = new ArrayList<>();
    }

    public void addCar(Car car) {
        Fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() //method for getting the total amount of registrationfee for all cars
    {
        int sum = 0;
        for (Car c : Fleet) {
            sum += c.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString() {
        String result = "";
        for (Car c : Fleet) {
            result += c;
        }
        return ("\n" + "\n"
                + "How many Cars available at the moment: "
                + Fleet.size()
                + result
                + "\n" + "sum of total amount of Registrationfee: ")
                + getTotalRegistrationFeeForFleet();
    }

}
