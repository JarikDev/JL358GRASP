package com;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("First FM");
    }
}
class Car {
    CarRadio radio;
    public Car(String station) {
        this.radio = new CarRadio(station);
    }
}
class CarRadio {
    String station;
    public CarRadio(String station) {
        this.station = station;
    }
}