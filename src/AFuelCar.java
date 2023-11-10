abstract class AFuelCar extends ACar // extension(nedarvning) of ACar
{
    int kmPrLitre;
    private int car = 0;
    private static int b = 0;

    public AFuelCar(String registrationNumber, String make, String model, int doors, int kmPrLitre) {
        super(registrationNumber, make, model, doors);
        this.kmPrLitre = kmPrLitre;
        b++;
        car = b;
    }

    abstract String getFuelType();
    public int getKmPrLitre(){

        return this.kmPrLitre;
    }
    @Override
    public String toString(){

        return super.toString()+"\n"; // calling toString method and adding my attribute
    }
}
