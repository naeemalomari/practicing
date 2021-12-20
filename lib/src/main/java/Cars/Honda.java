package Cars;

import practicing.Car;

public class Honda extends Car implements Cars {

    public Honda(String type, Integer model, Double price) {
        super(type, model, price);
    }

    public Honda() {
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
