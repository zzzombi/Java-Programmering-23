package exercises.solutions.E2;

public class PrintCalcOddNumbers {
    public static void main(String[] args) {
        int summary = 0;
        for (int i = 1; i <= 20; i+=2) {
        if (i % 1 == 0)
        System.out.println(summary + i);
        //Write a programthat uses a for loop to calculate and print the sum of the first 10 odd numbers.
    }
}
}
int sum=0;    
     for(int count = 1;count<20;count++){   
              if(count%2!=0){       
                      sum += count;           
                        //System.out.println("This iteration adds: " + count); 
                        //System.out.println("The total sum is now: " + sum);