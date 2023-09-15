package exercises.solutions.E2;

public class PrintMultipliedNumbers {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(number*i);
        }
    }
}
//Scanner versionen nedan.
import java.util.Scanner;

            public class testThings {
                public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                int a;

                System.out.print("Type in the number you want the multiplication table for: ");
                a = scan.nextInt();

                System.out.println("Multiplication table up to ten, for number " + a + ":");
                for(int b = 1; b <= 10; b++){
                System.out.println(a*b);
                    }
                    scan.close();
                }
            }