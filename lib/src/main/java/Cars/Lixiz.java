package Cars;

public class Lixiz {
    public String name;

    public Lixiz(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
      Lixiz l = (Lixiz) obj;

        return this.name == l.name;

    }
}
