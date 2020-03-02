import java.util.List;

public class Cloning implements Cloneable{
    private int id;
    private String name;
    public Example example;

    public Cloning(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Cloning cloneObject() throws CloneNotSupportedException {
        Cloning result = (Cloning) clone();
        result.example = new Example(12,"tothenew");
       return result;

    }

    @Override
    public String toString() {
        return "Cloning{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Example='" + example +
                '}';
    }
}

