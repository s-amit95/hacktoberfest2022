
 

import java.util.Scanner;
public class pattern
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
 
    int r = sc.nextInt();    
     for (int i=r; i>= 1 ; i--)
    {
        for (int j = i; j < r ; j++) {
            System.out.print(" ");
        }   
        for (int k = 1; k <= (2*i -1) ;k++) {
            if( k==1 || i == r|| k==(2*i-1)) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    sc.close();
}
}