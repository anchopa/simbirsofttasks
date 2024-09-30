public class Main {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar("Daewoo", "Nexia", 2008, 50);
        ElectricCar electricCar = new ElectricCar("Tesla", "Cybertruck", 2021, 123);

        gasCar.displayInfo();
        gasCar.start();
        gasCar.drive(290);
        gasCar.refuel();
        GasCar.displayTotalGasCars(); // стат метод

        electricCar.displayInfo();
        electricCar.start();
        electricCar.drive(150);
        electricCar.charge();
        ElectricCar.displayTotalElectricCars(); // стат метод
    }
}