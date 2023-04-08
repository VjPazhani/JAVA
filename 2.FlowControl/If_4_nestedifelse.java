//program to print the largest number
import java.util.Scanner;
public class If_4_nestedifelse {
  public static void main(String[] args) {
              double largest;
              Scanner dd = new Scanner(System.in);
              System.out.print("Enter the first number:");
                double n1 = dd.nextDouble();  
              System.out.print("Enter the first number:");
                double n2 = dd.nextDouble();       
                System.out.print("Enter the first number:");
                double n3 = dd.nextDouble();  
                if(n1>n2){
                     if(n1>n3){
                        largest = n1;
                     }
                     else{
                        largest = n3;
                     }
                } 
                else {
                    if(n2>n3){
                        largest = n2;
                    }
                    else{
                        largest = n3;
                    }
                } 
                System.out.println(largest +" is the largest number"); 
                dd.close();
    }
    
}

