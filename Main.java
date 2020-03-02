public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Cloning obj1 = new Cloning(101,"Amit");
        obj1.example = new Example(12,"tothenew");
        System.out.println(obj1);
        Cloning obj2 = obj1.cloneObject();
        System.out.println(obj2);

    }
}
