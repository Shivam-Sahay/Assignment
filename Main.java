import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the seconds");
        int temp=scn.nextInt();
        Seconds var= new Seconds(temp);
        var.Days(temp);
        var.hours(temp);
        var.Minutes(temp);

    }
}
