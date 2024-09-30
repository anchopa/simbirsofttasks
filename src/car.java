interface ElectricVehicle {
    void charge();
    int getBatteryLevel();
}

interface GasVehicle {
    void refuel();
    int getFuelLevel();
}

abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) { // Параметризованный конструктор
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void start(); // Абстрактный метод, должен быть реализован в подклассах

    public void displayInfo() {
        System.out.println("Марка: " + make + ", Модель: " + model + ", Год: " + year);
    }
}
