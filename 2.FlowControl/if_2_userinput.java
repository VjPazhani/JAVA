//program to get input from and print the negative number
import java.util.Scanner;
public class if_2_userinput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = input.nextInt();
        if(a<0){
            System.out.println("The number is negative"+ a);
        }
        else{
            System.out.println("The number is positive" + a);
        }
        input.close();
    }
}
