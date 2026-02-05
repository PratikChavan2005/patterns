import java.util.Scanner;
 
public class Spattern
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
          
        //Taking rows value from the user
  
        System.out.println("How many rows you want in this pattern?");
  
        int rows = sc.nextInt();
  
        System.out.println("Here is your pattern....!!!");
  
        //Printing upper half of the pattern
  
        for (int i = rows; i >= 1; i--)
        {
            //Printing spaces at the beginning of each row
  
            for (int j = 2*rows-i; j > i; j--)
            {
                System.out.print(" ");
            }
  
            //Printing i stars at the end of each row
  
            for (int j = i; j >= 1; j--)
            {
                System.out.print("* ");
            }
  
            //Control goes to next line
             
            System.out.println();
        }
  
        //Printing lower half of the pattern 
  
        for (int i = 2; i <= rows; i++)
        {
            //Printing spaces at the beginning of each row
  
            for (int j = 2*rows-i; j > i; j--)
            {
                System.out.print(" ");
            }
  
            //Printing i stars at the end of each row
  
            for (int j = i; j >= 1; j--)
            {
                System.out.print("* ");
            }
  
            //Control goes to next line
             
            System.out.println();
        }
  
        //Closing the resources
  
        sc.close();
    }
}