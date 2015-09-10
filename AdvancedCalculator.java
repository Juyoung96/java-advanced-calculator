/*
 * Project: Advanced Calculator
 * Description: A more advanced calculator that takes user input and has a switch structure
 * Name: Juyoung Lee
 * Date: Sept 10, 2015
 */

import java.util.Scanner;

public class AdvancedCalculator {
 
  public static void main ( String[] args ) {
    
    Scanner s = new Scanner( System.in );
   /*
    * char = '' single quote
    * String = "" double quotes
    * String s = 'x'; // illegal
    * char eh = "x';// illegal
    * ch = choce // can't put STring om car
    * 
    * String s = "Hollywood"; // String = arrat of char
    */
    String choice;
    char ch;
    double d1,d2;
    
    System.out.println( "Make your arithmetic choice below: " );
    System.out.println( "A. Addition\tS. Subtraction\tM. Multiplication\tD. Division" );
    
    choice = s.nextLine();
    ch = choice.charAt(0);
   // ch = Character.toLowerCase( ch );
   //System.out.println( ch );
    
    //if ( ch != 'a' || ch != 's' || ch != 'm' || ch != 'd') {
    //System.out.println( "Error. That's not a choice. Only choose A, S, M or D.\n" );
    //} else {
    
    System.out.println( "Enter the first number: ");
    d1 = s.nextDouble();
    System.out.println( "Enter the second number: "); 
    d2 = s.nextDouble();
    
    // switch to choose which operand to use
    switch (ch ){
      case 'A': 
      case 'a':
        System.out.println( d1 + " + " + d2 + " = " + (d1+d2) );
        break;
      case 'S':
      case 's':
        System.out.println( d1 + " - " + d2 + " = " + (d1-d2) );
        break;
      case 'M' :
      case 'm' :
        System.out.println( d1 + " x " + d2 + " = " + (d1*d2) );
        break;
      case 'D' :
      case 'd' :
        System.out.println( d1 + " / " + d2 + " = " + (d1/d2) );
        break;
      default:
        System.out.println( "Error. That's not a choice. Only choose A, S, M or D." );
        
    } // end of switch
    
   // } // end of else statement
  } // end main method
  
} // end class