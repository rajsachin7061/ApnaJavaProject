
// public class palidrome {
// public static void main(String[] args) {
//     String str = "madam";
//     String reversed = new StringBuilder(str).reverse().toString();

//     System.out.println(str.equals(reversed));
    
// }
// }

import java.util.Scanner;

public class palidrome {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String reversed = new StringBuilder(str).reverse().toString();

    System.out.println(str.equals(reversed));
    
}
}