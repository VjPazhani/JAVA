// program to print the positve,negative number
import java.util.Scanner;
public class If_3_ifelseif {
    public static void main(String args[]){
    Scanner dd = new Scanner(System.in);
    System.out.print("Enter the number:");
        int number = dd.nextInt();
        if(number > 0){
            System.out.println(number + "is the negative" );
        }
        else if(number<0){
            System.out.println(number + "is the negative" );
        }
        else {
            System.out.println("The number is the zero");
        }   
        dd.close();
    }


}
