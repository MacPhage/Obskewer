//
//  Numbers.java
//
//  Java Source File
//
//  Created by Austin Jackson,
//
//  Further updates
//  http://github.com/MacPhage
//

package com.ruthlessphysics.obskewer.algorithm;

import com.ruthlessphysics.util.Debug;

import javax.swing.*;

public class Numbers
{
  /* Letters Numbers
  // Swaps each letter with its position in the alphabet
  */

  static String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  public static void performEncode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to encode: ","Numbers are fun.");
    JOptionPane.showInputDialog("Original: \'"+in+"\'\nEncoded: ",encode(in));
  }
  public static void performDecode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to decode: ","030120 041507");
    JOptionPane.showInputDialog("Encoded: \'"+in+"\'\n\t(Invalid characters removed.)\nDecoded: ",decode(in));
  }
  public static String encode(String a) //Custom parameters
  {
    String r = ""; //End result, ready for appending
    char c; //Current character of i
    int p; //Position in the alphabet
    int e = 0; //Count of unrecognized characters
    a = a.toUpperCase();

    if(hasNumbers(a))
    {
      a = a.replaceAll("[0-9]","");
      //return "The input to encode to Numbers cannot contain numbers, silly.";
    }

    for(int i = 0; i < a.length(); i++)
    {
      c = a.charAt(i);
      p = alphabet.indexOf(c);
      if(p == 0)
      {
        r += " ";
      }
      else if(p == -1)
      {
        r += c;
        e++;
      }
      else if(p < 10)
      {
        r += "0"+Integer.toString(p);
      }
      else if(p > 9)
      {
        r += Integer.toString(p);
      }
      else
      {
        System.out.println("(Numbers.java) This should never be run.");
      }
    }
    if(e > 0)
    {
      Debug.alert(e+" character(s) were unrecognized. \n"+
      "Only alphabetic characters are designed to work with this cipher, "+
      "but any other characters have been kept.\n\n"+
      "Be advised, when decoding this cipher, the invalid characters will be removed.","warning");
    }
    return r;
  }
  public static String decode(String a) //Custom parameters
  {
    a = a.replaceAll("[^\\s^0-9]","");
    String r = ""; //End result
    String[] s = a.split(" "); //Splits Number phrase into words, by index
    char temp1,temp2;
    String c; //Variable to store picked out dual-chars (String Numbers like "01" and "13")
    int p; //dual-chars converted into Integer value, used to find the placement in the alphabet
    int e = 0; //Unrecognized "letter" counter
    try
    {
      for(int si = 0; si < s.length; si++)
      {
        for(int i = 0; i < s[si].length(); i+=2)
        {
          //Example: 04
          temp1 = s[si].charAt(i); //Gets the '0' in the example
          temp2 = s[si].charAt(i+1); //Gets the '4' in the example
          c = Character.toString(temp1)+Character.toString(temp2); //Combines them
          p = Integer.parseInt(c); //Makes a number from the String
          if(p > 26 || p < 0) //If the number isn't within the range, add it how it is, tally an error, move on
          {
            e++;
            r += c;
          }
          else
          {
            r += Character.toString(alphabet.charAt(p));
          }
        }
        r += " ";
      }
    }
    catch (Exception error)
    {
      error.printStackTrace();
      JOptionPane.showMessageDialog(null,error.getStackTrace(),"Obskewer Error",JOptionPane.ERROR_MESSAGE);
    }
    if(e > 0)
    {
      Debug.alert(e+" number \"letters\" were unrecognized. \n"+
      "They are kept as is in number form. Also, this cipher doesn\'t support punctuation.","warning");
    }
    return r;
  }
  public static boolean hasNumbers(String a)
  {
    if(a.indexOf('0') != -1)
    {
      return false;
    }
    else if(a.indexOf('1') != -1)
    {
      return false;
    }
    else if(a.indexOf('2') != -1)
    {
      return false;
    }
    else if(a.indexOf('3') != -1)
    {
      return false;
    }
    else if(a.indexOf('4') != -1)
    {
      return false;
    }
    else if(a.indexOf('5') != -1)
    {
      return false;
    }
    else if(a.indexOf('6') != -1)
    {
      return false;
    }
    else if(a.indexOf('7') != -1)
    {
      return false;
    }
    else if(a.indexOf('8') != -1)
    {
      return false;
    }
    else if(a.indexOf('9') != -1)
    {
      return false;
    }
    else
    {
      return true;
    }
  }
  public static boolean hasNumbers(char a)
  {
    if(a == '0')
    {
      return false;
    }
    else if(a == '1')
    {
      return false;
    }
    else if(a == '2')
    {
      return false;
    }
    else if(a == '3')
    {
      return false;
    }
    else if(a == '4')
    {
      return false;
    }
    else if(a == '5')
    {
      return false;
    }
    else if(a == '6')
    {
      return false;
    }
    else if(a == '7')
    {
      return false;
    }
    else if(a == '8')
    {
      return false;
    }
    else if(a == '9')
    {
      return false;
    }
    else
    {
      return true;
    }
  }
}
