//
//  Obscurer.java
//
//  Java Source File
//
//  Created by Austin Jackson,
//  Last modified on June 9, 2014.
//
//  http://srchub.org/u/mac
//

import java.util.*;
import javax.swing.*;

public class ObscurerCLI
{
   static Scanner console = new Scanner(System.in);
   public static void main(String args[])
   {
      String operation;
      intro();
      howToUse();
      while(true)
      {
         System.out.println("Operations: \'obscure\',\'reverse\',\'reverseSearch\',\'howToUse\',\'howItWorks\',\'stop\'");
         System.out.print("Type your operation of choice: ");
         operation = console.next();
         System.out.print("\n");
         if(operation.equals("obscure"))
         {
            performObscure();
         }
         else if(operation.equals("reverse"))
         {
            performReverse();
         }
         else if(operation.equals("reverseSearch"))
         {
            performReverseSearch();
         }
         else if(operation.equals("howToUse"))
         {
            howToUse();
         }
         else if(operation.equals("howItWorks"))
         {
            howItWorks();
         }
         else if(operation.equals("stop"))
         {
            break;
         }
         else
         {
            System.out.println("That wasn\'t a valid operation.");
         }
      }
   }
   public static void performObscure()
   {
      System.out.println("Enter something to obscure: ");
      String in = console.next();
      System.out.println("Enter a int-integer key: ");
      int key = console.nextInt();
      System.out.println("key: "+key);
      System.out.println("original: \'"+in+"\'");
      System.out.println("Attempting to obscure with short-number key: \'"+key+"\'\n\tresulting in: \'"+obscure(in,key)+"\'");
   }
   public static void performReverse()
   {
      System.out.println("Enter something to reverse: ");
      String in = console.next();
      System.out.println("Enter a int-integer key: ");
      int key = console.nextInt();
      System.out.println("Attempting to reverse with short-number key: \'"+key+"\'\n\tresulting in: \'"+reverse(in,key)+"\'");
   }
   public static void performReverseSearch()
   {
      System.out.println("Enter something to reverse: ");
      String in = console.next();
      for(int i = -10; i < 10; i++) //Checks multiple keys
      {
         System.out.println("Attempting to reverse with short-number key: \'"+i+"\'\n\tresulting in: \'"+reverse(in,i)+"\'");
      }
      System.out.println("\nYou must now look through the previous output to find which string is most likely correct. \nHave fun.");
   }
   public static void howToUse()
   {
      System.out.print("This program lets you (very insecurely, but confusingly) encode and decode messages. ");
      System.out.print("To obscure a message, use the obscure operation and give it a key of under 10 for best results. ");
      System.out.print("A key is what is mathematically used to decode your message and is required for decoding. ");
      System.out.print("A key is a positive or negative number typically under the absolute value of 10. ");
      System.out.print("To decode a message, use the reverse operation and give it the key that you goes with the message. ");
      System.out.print("If you don\'t have the key, you can use the reverseSearch operation to attempt at decoding it without a key. ");
      System.out.println("Follow these rules:");
      System.out.println(" - All messages can\'t have spaces and should use Underscores(_) instead.");
      System.out.println(" - All keys should be under the absolute value of 10.");
      System.out.println("Type anything and then Enter/Return to continue.\n\n");
      console.next();
   }
   public static void howItWorks()
   {
      System.out.println("This program, in no way, is meant to be extremely secure, because of the way it works. ");
      System.out.println("All characters have a number that represents them.");
      System.out.println("This works by adding the value of your integer key to each character in your message,");
      System.out.println("thus *obscuring* your message. You can *reverse* this by subtracting the key again.");
      System.out.println("You can not interpret an obscured message without the key, but the key isn\'t too");
      System.out.println("hard to figure out (there\'s only 20 keys that are actually valid).");
      System.out.println("Type anything and then Enter/Return to continue.\n\n");
      console.next();
   }
   public static void intro()
   {
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("~~~~~~~~~WELCOME TO MAC\'S OBSCURER~~~~~~~~~");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   }
   public static String obscure(String a, int inc)
   {
      StringBuilder b = new StringBuilder(a); //Converts String to StringBuilder
      char current;
      for(int i = 0; i < a.length(); i++) //Loops through every index
      {
         current = b.charAt(i); //Character at current index is saved
         b.setCharAt(i, current+=inc); //Character at current index is replaced by that character incremented
      }
      String c = new String(b); //Converts StringBuilder to String
      return c;
   }
   public static String obscure(String a) //Same as obscure(String,int) except it generates a Key
   {
      int inc = generateKey(a); //Generates a key based on the length of the String (unused)
      StringBuilder b = new StringBuilder(a);
      char current;
      for(int i = 0; i < a.length(); i++)
      {
         current = b.charAt(i);
         b.setCharAt(i, current+=inc);
      }
      String c = new String(b);
      return c;
   }
   public static int generateKey(String a)
   {
      return a.length();
   }
   public static String reverse(String a, int inc)
   {
      StringBuilder b = new StringBuilder(a);
      char current;
      for(int i = 0; i < a.length(); i++)
      {
         current = b.charAt(i);
         b.setCharAt(i, current-=inc); //Same as obscure(), except "-=inc" rather than "+=inc". It's does the opposite.
      }
      String c = new String(b);
      return c;
   }
}
