import java.util.Scanner;

public class Strings {
    public void Sortstr(String str) {
        char temp, temp2;
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (int j = 0; j < chars.length; j++) {

                if (chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println(chars);
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the text want to sort");
        String str= scn.next();
        Strings str2 = new Strings();
        str2.Sortstr(str);
    }
}
