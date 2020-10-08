/**
* This program caculates the amount of logs that can fit on a truck base of the leangth the user choses.
*
* @author  John Junior Omage
* @version 1.0
* @since   2020-09-15 
*/
 import java.util.Scanner;

    public class Log {
	
        public static void main(String[] args){
            float length;
            float amount;
            //get the legth the user enters
            Scanner scan = new Scanner(System.in);
            length= scan.nextFloat();
            //apply formular 
            amount= 1100/ (20 * length);
            //output to console
            
            System.out.println("the amount of " + length + " metre logs that can fit the truck is "+ amount + " logs");
            
        }
    }    