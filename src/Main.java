public class Main {
    public static void main(String[] args) {


        Car Audi = new DieselCar("AA 10 100", "Audi", "S5", 4, 25, "Diesel", true);
        Car Volkswagen = new GasolinCar("BB 20 200", "Volkswagen", "Jetta:34", 4, 10, "Benzin");
        Car Mercedes = new ElectricCar("CC 30 300", "Tesla", "EQA", 4, 50000, 100);


        FleetOfCars carList = new FleetOfCars();

        carList.addCar(Audi);
        carList.addCar(Volkswagen);
        carList.addCar(Mercedes);


        System.out.println(carList);

    }
}