package web.model;

import java.util.Objects;

public class Car {
    private final String model;

    private final String type;

    private final Integer gosnomer;

    public Car(String model, String type, Integer gosnomer) {
        this.model = model;
        this.type = type;
        this.gosnomer = gosnomer;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public Integer getGosnomer() {
        return gosnomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model)
                && Objects.equals(type, car.type)
                && Objects.equals(gosnomer, car.gosnomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, gosnomer);
    }

    @Override
    public String toString() {
        return "Car: model: " + model + ", type: " + type + ", gosnomer: " + gosnomer;
    }
}