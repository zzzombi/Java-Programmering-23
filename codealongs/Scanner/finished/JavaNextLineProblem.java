import java.util.Scanner;

public class JavaNextLineProblem {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

	
		System.out.print("Enter your name: ");
		
        String name = input.nextLine();

	
		System.out.print("Enter your age: ");
		
        int age = input.nextInt();

	
		System.out.print("Describe yourself in a sentence: ");
		
        String description = input.nextLine();

        input.nextLine();

		System.out.print("Enter a message: ");
		
        String message = input.nextLine();
	
    //använd next line efter varje nextInt och innan nästa nextLine
    
    
    }
}