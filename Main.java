import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "";
        while (!str.equals("done")) {
            str = new String(scn.next());
            if (str.equals("done"))
                break;
            else if (str.charAt(0) == str.charAt(str.length() - 1))
                System.out.println("Yes! last character and first character of " + str + " is same");
            else
                System.out.println("No! last character and first character of " + str + " is not same");
            //str="";
        }
        System.out.println("done entered");
    }
}
