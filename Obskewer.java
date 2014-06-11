//
//  Obskewer.java
//
//  Java Source File
//
//  Created by Austin Jackson,
//  Last modified on June 10, 2014.
//
//  Editted with Atom
//  https://atom.io/
//
//  Further updates
//  http://srchub.org/u/mac
//

import javax.swing.*;

public class Obskewer
{
  public static void main(String args[])
  {
    String operation;
    while(true)
    {
      System.out.println("Prompting user for operation...");
      operation = JOptionPane.showInputDialog(null,"Operations: \'obscure\',\'reverse\',\'stop\'\nType your operation of choice: ","obscure");
      if(operation.equals("obscure"))
      {
        System.out.println("performObscure() called...");
        performObscure();
      }
      else if(operation.equals("reverse"))
      {
        System.out.println("performReverse() called...");
        performReverse();
      }
      else if(operation.equals("stop"))
      {
        System.out.println("a stop has been issued...");
        System.exit(0);
      }
      else
      {
        JOptionPane.showMessageDialog(null,"That wasn\'t a valid operation.","Obscurer",JOptionPane.INFORMATION_MESSAGE);
      }
    }
  }
  public static void performObscure()
  {
    System.out.println("performObscure() run started...");
    String in = JOptionPane.showInputDialog(null,"Enter something to obscure: ","My secrets!");
    int key = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a short-integer key: ","2"));
    String n = JOptionPane.showInputDialog("key: \'"+key+"\'\noriginal: \'"+in+"\'\nResult: ",obscure(in,key));
  }
  public static void performReverse()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to reverse: ","O{\"ugetgvu#");
    int key = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a short-integer key: ","2"));
    String n = JOptionPane.showInputDialog("key: \'"+key+"\'\noriginal: \'"+in+"\'\nResult: ",reverse(in,key));
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
