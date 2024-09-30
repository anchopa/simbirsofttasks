class GasCar extends Vehicle implements GasVehicle {
    private int fuelLevel; // инкапсуляция
    private static int totalGasCars = 0; // стат поле

    public GasCar(String make, String model, int year, int fuelLevel) {
        super(make, model, year);
        this.fuelLevel = fuelLevel;
        totalGasCars++; // использование стат поля
    }

    @Override
    public void start() {
        if (fuelLevel > 0) {
            System.out.println("Бензиновый автомобиль заводится.");
        } else {
            System.out.println("Недостаточно топлива.");
        }
    }

    @Override
    public void refuel() {
        fuelLevel = 100;
        System.out.println("Автомобиль заправлен.");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    public static void displayTotalGasCars() { // стат метод
        System.out.println("Всего бензиновых автомобилей: " + totalGasCars);
    }

    public void drive(int distance) {
        if (fuelLevel - distance / 10 >= 0) {
            fuelLevel -= distance / 10;
            System.out.println("Проехали " + distance + " км. Остаток топлива: " + fuelLevel + "%");
        } else {
            System.out.println("Недостаточно топлива для поездки.");
        }
    }
}