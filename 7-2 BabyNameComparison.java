import java.util.*;
public class BabyNameComparison {
    public static void main(String[] args) {
        // Write your code here
        String name1, name2, name3, c1, c2, c3, c4, c5, c6;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter three names");
        name1 = inputDevice.next();
        name2 = inputDevice.next();
        name3 = inputDevice.next();
        c1 = name1.concat(" " + name2);
        c2 = name1.concat(" " + name3);
        c3 = name2.concat(" " + name1);
        c4 = name2.concat(" " + name3);
        c5 = name3.concat(" " + name1);
        c6 = name3.concat(" " + name2);
        System.out.println("Here is a list of name combinations: ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}
