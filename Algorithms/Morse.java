//
//  OtherCipher.java
//
//  Java Source File
//
//  Created by Austin Jackson,
//  Last modified on June 11, 2014.
//
//  Editted with Atom
//  https://atom.io/
//
//  Further updates
//  http://srchub.org/u/mac
//

package Algorithms;

import javax.swing.*;

public class Morse
{
  /* Morse Code
  // Used to transmit the alphabet on an electrical telegraph.
  // The telegraph was invented in 1837 by Samuel Morse.
  */
  public static void performEncode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to encode: ","Samuel Morse");
    String n = JOptionPane.showInputDialog("Original: \'"+in+"\'\nEncoded: ",encode(in));
  }
  public static void performDecode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to decode: ","... .- -- ..- . .-.. / -- --- .-. ... . ");
    String n = JOptionPane.showInputDialog("Encoded: \'"+in+"\'\nDecoded: ",decode(in));
  }
  public static String encode(String a) //Custom parameters
  {
    String r = ""; //Result
    a = a.toUpperCase();
    char c; //Current character
    for(int i = 0; i < a.length(); i++)
    {
      c = a.charAt(i);
      if(c == ' ')
      {
        r += "/ ";
      }
      else if(c == '0')
      {
        r += "----- ";
      }
      else if(c == '1')
      {
        r += ".---- ";
      }
      else if(c == '2')
      {
        r += "..--- ";
      }
      else if(c == '3')
      {
        r += "...-- ";
      }
      else if(c == '4')
      {
        r += "....- ";
      }
      else if(c == '5')
      {
        r += "..... ";
      }
      else if(c == '6')
      {
        r += "-.... ";
      }
      else if(c == '7')
      {
        r += "--... ";
      }
      else if(c == '8')
      {
        r += "---.. ";
      }
      else if(c == '9')
      {
        r += "----. ";
      }
      else if(c == '.')
      {
        r += ".-.-.- ";
      }
      else if(c == ',')
      {
        r += "--..-- ";
      }
      else if(c == '?')
      {
        r += "..--.. ";
      }
      else if(c == '-')
      {
        r += "-....- ";
      }
      else if(c == '=')
      {
        r += "-...- ";
      }
      else if(c == ':')
      {
        r += "---... ";
      }
      else if(c == ';')
      {
        r += "-.-.-. ";
      }
      else if(c == '(')
      {
        r += "-.--. ";
      }
      else if(c == ')')
      {
        r += "-.--.- ";
      }
      else if(c == '\\')
      {
        r += "-..-. ";
      }
      else if(c == '\"')
      {
        r += ".-..-. ";
      }
      else if(c == '$')
      {
        r += "...-..- ";
      }
      else if(c == '\'')
      {
        r += ".----. ";
      }
      else if(c == '_')
      {
        r += "..--.- ";
      }
      else if(c == '@')
      {
        r += ".--.-. ";
      }
      else if(c == '!')
      {
        r += "---. ";
      }
      else if(c == '+')
      {
        r += ".-.-. ";
      }
      else if(c == '~')
      {
        r += ".-... ";
      }
      else if(c == '#')
      {
        r += "...-.- ";
      }
      else if(c == '/')
      {
        r += " ";
      }
      else if(c == 'A')
      {
        r += ".- ";
      }
      else if(c == 'B')
      {
        r += "-... ";
      }
      else if(c == 'C')
      {
        r += "-.-. ";
      }
      else if(c == 'D')
      {
        r += "-.. ";
      }
      else if(c == 'E')
      {
        r += ". ";
      }
      else if(c == 'F')
      {
        r += "..-. ";
      }
      else if(c == 'G')
      {
        r += "--. ";
      }
      else if(c == 'H')
      {
        r += ".... ";
      }
      else if(c == 'I')
      {
        r += ".. ";
      }
      else if(c == 'J')
      {
        r += ".--- ";
      }
      else if(c == 'K')
      {
        r += "-.- ";
      }
      else if(c == 'L')
      {
        r += ".-.. ";
      }
      else if(c == 'M')
      {
        r += "-- ";
      }
      else if(c == 'N')
      {
        r += "-. ";
      }
      else if(c == 'O')
      {
        r += "--- ";
      }
      else if(c == 'P')
      {
        r += ".--. ";
      }
      else if(c == 'Q')
      {
        r += "--.- ";
      }
      else if(c == 'R')
      {
        r += ".-. ";
      }
      else if(c == 'S')
      {
        r += "... ";
      }
      else if(c == 'T')
      {
        r += "- ";
      }
      else if(c == 'U')
      {
        r += "..- ";
      }
      else if(c == 'V')
      {
        r += "...- ";
      }
      else if(c == 'W')
      {
        r += ".-- ";
      }
      else if(c == 'X')
      {
        r += "-..- ";
      }
      else if(c == 'Y')
      {
        r += "-.-- ";
      }
      else if(c == 'Z')
      {
        r += "--.. ";
      }
      else
      {
        r += (c+" ");
      }
    }
    return r;
  }
  public static String decode(String a) //Custom parameters
  {
    //Necessary calculations
    return a;
  }
}
