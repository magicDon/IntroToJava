/* Created by: Donjana Allgood 

Purpose: 

*/ 
import java.util.Scanner; 

public class checkNumber
{
    public static void main(String[] args)
    {
        System.out.println("This is another example for selection.\n"); 
        
        int num; 
        Scanner input = new Scanner(System.in); 

        System.out.print("Please enter an integer: "); 
        num = input.nextInt(); 
        //Two way selection (if/else) to get an even number 
        //if statment means if the remainder is 0 it is good
        if (num%2==0) {
            System.out.println("This is what I need."); 
        }
        //else the remainder shall print the switch cases
        else {
            System.out.println("This is not what I need."); 
            num++; 
            System.out.println("I have to change it to "+ num); 
        }
            //Use conditional expression to get an even number 
            System.out.println(num%2==0?num:++num); 
            //Mulit-way selection with switch case structure 
            switch(num%5){
                case 0: 
                    System.out.println("This number is a multiplier of 5."); 
                break; 
                case 1: 
                    System.out.println("It has a remainder of 1 from num%5."); 
                    break; 
                case 2: 
                    System.out.println("It has a remainder of 2 from num%5."); 
                    break;
                case 3:
                    System.out.println("It has a remainder of 3 from num%5."); 
                    break; 
                case 4: 
                System.out.println("It has a remainder of 4 from num%5. "); 
                break; 
            }
            System.out.println("\nThis is the end of the program. "); 
                } //end of main method 

    }// end class check Numbers 