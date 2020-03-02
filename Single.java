import com.sun.org.apache.bcel.internal.generic.SIPUSH;

public class Single {

    private Single() {
        System.out.println("this is a singleton class");
    }

    private static Single obj1 = new Single();

    public static Single getinstance() {
        return obj1;
    }
}

 class Main
{
    public static void main(String[] args)
    {
        Single obj1= Single.getinstance();
        Single obj2= Single.getinstance();

        if(obj1.equals(obj2))
            System.out.println("Both obj1 and obj2 are referencing the same object");
        else
            System.out.println("Both obj1 and obj2 are referencing the different object");
    }

}