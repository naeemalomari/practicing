package practicing;

public class Duck extends Animal implements Cat{

    public Duck() {
    }

    @Override
    public void vv() {
        System.out.println("hi");
    }

    @Override
    public void bb() {
        System.out.println("hello");
    }


}
