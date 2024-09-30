class ElectricCar extends Vehicle implements ElectricVehicle {
    private int batteryLevel;
    private static int totalElectricCars = 0;

    public ElectricCar(String make, String model, int year, int batteryLevel) {
        super(make, model, year);
        this.batteryLevel = batteryLevel;
        totalElectricCars++;
    }

    @Override
    public void start() {
        if (batteryLevel > 0) {
            System.out.println("Электромобиль заводится.");
        } else {
            System.out.println("Батарея разряжена.");
        }
    }

    @Override
    public void charge() {
        batteryLevel = 100;
        System.out.println("Электромобиль заряжен.");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public static void displayTotalElectricCars() {
        System.out.println("Всего электромобилей: " + totalElectricCars);
    }

    public void drive(int distance) {
        if (batteryLevel - distance / 5 >= 0) {
            batteryLevel -= distance / 5;
            System.out.println("Проехали " + distance + " км. Остаток заряда батареи: " + batteryLevel + "%");
        } else {
            System.out.println("Недостаточно заряда батареи для поездки.");
        }
    }
}