//
//  ClassicShift.java
//
//  Java Source File
//
//  Created by Austin Jackson,
//
//  Further updates
//  http://srchub.org/u/mac
//

package com.ruthlessphysics.obskewer.algorithm;

import javax.swing.*;

public class ClassicShift
{
/* ClassicShift
// A form of the Caesar Cipher debuted in the first version of Obskewer.
*/
  public static void performEncode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to encode: ","My secrets!");
    int key = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a short-integer key: ","2"));
    JOptionPane.showInputDialog("Key (remember this!): \'"+key+"\'\nOriginal: \'"+in+"\'\nEncoded: ",encode(in,key));
  }
  public static void performDecode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to decode: ","O{\"ugetgvu#");
    int key = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a short-integer key: ","2"));
    JOptionPane.showInputDialog("Input Key: \'"+key+"\'\nEncoded: \'"+in+"\'\nDecoded: ",decode(in,key));
  }
  public static String encode(String a, int inc)
  {
    StringBuilder b = new StringBuilder(a); //Converts String to StringBuilder (needed for setCharAt())
    char current;
    for(int i = 0; i < a.length(); i++) //Loops through every index
    {
      current = b.charAt(i); //Character at current index is saved
      b.setCharAt(i, current+=inc); //Character at current index is replaced by that character incremented
    }
    String c = new String(b); //Converts StringBuilder to String
    return c;
  }
  public static String decode(String a, int inc)
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
