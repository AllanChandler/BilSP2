public abstract class ACar implements Car //  implements car interface and the methods except getRegistrationFee();
{

    private String registrationNumber;
    private final String brand;
    private final String model;
    private final int getNumberOfDoors;
    private static int a = 1;
    private int i = 0;


    public ACar(String registrationNumber, String brand, String model, int doors) // constructor
    {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.getNumberOfDoors = doors;
        this.i = a; // int i = a which is 1
        a++; // increment the value by 1

    }

    public String getRegistrationNumber() {

        return this.registrationNumber;
    }

    public String getMake() {

        return this.brand;
    }

    public String getModel() {

        return this.model;
    }

    public int getNumberOfDoors() {

        return this.getNumberOfDoors;
    }

    @Override
    public String toString() {

        return "\n" + "Car: " + i; // returning my cars numbers
    }

}


