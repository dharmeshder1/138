import java.util.Scanner;

public class getvalue{
  public static void main(String[]args) {
    
    Scanner myObj = new Scanner(System.in); 
    System.out.print("Enter number:");
    int x = myObj.nextInt();                    

    System.out.print("Type number:");
    int y = myObj.nextInt();                   

    int sum = x + y;                            
    System.out.println("Sum is: "+sum);   
  }
} 