public class Example {
    private int id;
    private String name;

    public Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Example(Example ex)
    {
        id=ex.id;
        name = ex.name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args)
    {
        Example example1= new Example(101,"Amit");
        Example example2 = new Example(example1);
        System.out.println(example2.id+" "+example2.name);
    }
}
