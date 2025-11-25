// public class Condition {
//     public static void main(String []args) {
//         int age = 22;

//         if(age>=18) {
//             System.out.println("Adult");
//         }else {
//             System.out.println("Not Adult");
//         }
//     }
// }


import java.util.*;
public class Condition {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: - ");
        int age = sc.nextInt();

        if(age>=18) {
            System.out.println("Adult");
        }else {
            System.out.println("Not Adult");
        }
    }
   
}
