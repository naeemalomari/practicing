package practicing;

import Cars.Cars;

import javax.lang.model.element.TypeElement;
import java.util.Objects;

public abstract class Car implements Cars {
    protected String type;
    protected Integer model;
    protected Double price;


    public Car(String type, Integer model, Double price) {
        this.type = type;
        this.model = model;
        this.price = price;
    }

    public Car() {
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public void setModel(Integer model) {
        this.model = model;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" + "type='" + type + '\'' + ", model=" + model + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(type, car.type) && Objects.equals(model, car.model) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, model, price);
    }

}