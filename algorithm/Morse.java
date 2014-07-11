//
//  Morse.java
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

public class Morse
{
  /* Morse Code
  // Used to transmit the alphabet on an electrical telegraph.
  // The telegraph was invented in 1837 by Samuel Morse.
  */
  public static void performEncode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to encode: ","Samuel Morse");
    JOptionPane.showInputDialog("Original: \'"+in+"\'\nEncoded: ",encode(in));
  }
  public static void performDecode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to decode: ","... .- -- ..- . .-.. / -- --- .-. ... . ");
    JOptionPane.showInputDialog("Encoded: \'"+in+"\'\nDecoded: ",decode(in));
  }
  public static String encode(String a)
  {
    String r = ""; //Result
    int e = 0; //Count of unrecognized characters
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
        e++;
        r += (c+" ");
      }
    }
    if(e > 0)
    {
      JOptionPane.showMessageDialog(null,e+" character(s) weren\'t recognized. They "+
      "are kept the same in their unencoded form","Obskewer",JOptionPane.WARNING_MESSAGE);
    }
    return r;
  }
  public static String decode(String a) //Custom parameters
  {
    String r = ""; //Result
    int e = 0; //Count of unrecognized characters
    String[] b = a.split(" "); //Gets each "letter" between the spaces and saves it in a String array
    //It's built-in methods like String.split() that make me love Java so much
    for(int i = 0; i < b.length; i++) //NOTE TO SELF: Improve later to match an Alphabet array with a Morse array
    {
      if(b[i].equals("/"))
      {
        r += " ";
      }
      else if(b[i].equals("-----"))
      {
        r += "0";
      }
      else if(b[i].equals(".----"))
      {
        r += "1";
      }
      else if(b[i].equals("..---"))
      {
        r += "2";
      }
      else if(b[i].equals("...--"))
      {
        r += "3";
      }
      else if(b[i].equals("....-"))
      {
        r += "4";
      }
      else if(b[i].equals("....."))
      {
        r += "5";
      }
      else if(b[i].equals("-...."))
      {
        r += "6";
      }
      else if(b[i].equals("--..."))
      {
        r += "7";
      }
      else if(b[i].equals("---.."))
      {
        r += "8";
      }
      else if(b[i].equals("----."))
      {
        r += "9";
      }
      else if(b[i].equals(".-.-.-"))
      {
        r += ".";
      }
      else if(b[i].equals("--..--"))
      {
        r += ",";
      }
      else if(b[i].equals("..--.."))
      {
        r += "?";
      }
      else if(b[i].equals("-....-"))
      {
        r += "-";
      }
      else if(b[i].equals("-...-"))
      {
        r += "=";
      }
      else if(b[i].equals("---..."))
      {
        r += ":";
      }
      else if(b[i].equals("-.-.-."))
      {
        r += ";";
      }
      else if(b[i].equals("-.--."))
      {
        r += "(";
      }
      else if(b[i].equals("-.--.-"))
      {
        r += ")";
      }
      else if(b[i].equals("-..-."))
      {
        r += "/";
      }
      else if(b[i].equals(".-..-."))
      {
        r += "\"";
      }
      else if(b[i].equals("...-..-"))
      {
        r += "$";
      }
      else if(b[i].equals(".----."))
      {
        r += "\'";
      }
      else if(b[i].equals("..--.-"))
      {
        r += "_";
      }
      else if(b[i].equals(".--.-."))
      {
        r += "@";
      }
      else if(b[i].equals("---.") || b[i].equals("-.-.--"))
      {
        r += "!";
      }
      else if(b[i].equals(".-.-."))
      {
        r += "+";
      }
      else if(b[i].equals(".-..."))
      {
        r += "~";
      }
      else if(b[i].equals("...-.-"))
      {
        r += "#";
      }
      else if(b[i].equals(".-"))
      {
        r += "A";
      }
      else if(b[i].equals("-..."))
      {
        r += "B";
      }
      else if(b[i].equals("-.-."))
      {
        r += "C";
      }
      else if(b[i].equals("-.."))
      {
        r += "D";
      }
      else if(b[i].equals("."))
      {
        r += "E";
      }
      else if(b[i].equals("..-."))
      {
        r += "F";
      }
      else if(b[i].equals("--."))
      {
        r += "G";
      }
      else if(b[i].equals("...."))
      {
        r += "H";
      }
      else if(b[i].equals(".."))
      {
        r += "I";
      }
      else if(b[i].equals(".---"))
      {
        r += "J";
      }
      else if(b[i].equals("-.-"))
      {
        r += "K";
      }
      else if(b[i].equals(".-.."))
      {
        r += "L";
      }
      else if(b[i].equals("--"))
      {
        r += "M";
      }
      else if(b[i].equals("-."))
      {
        r += "N";
      }
      else if(b[i].equals("---"))
      {
        r += "O";
      }
      else if(b[i].equals(".--."))
      {
        r += "P";
      }
      else if(b[i].equals("--.-"))
      {
        r += "Q";
      }
      else if(b[i].equals(".-."))
      {
        r += "R";
      }
      else if(b[i].equals("..."))
      {
        r += "S";
      }
      else if(b[i].equals("-"))
      {
        r += "T";
      }
      else if(b[i].equals("..-"))
      {
        r += "U";
      }
      else if(b[i].equals("...-"))
      {
        r += "V";
      }
      else if(b[i].equals(".--"))
      {
        r += "W";
      }
      else if(b[i].equals("-..-"))
      {
        r += "X";
      }
      else if(b[i].equals("-.--"))
      {
        r += "Y";
      }
      else if(b[i].equals("--.."))
      {
        r += "Z";
      }
      else if(b[i].equals("......"))
      {
        r += "[Morse slang: Error]";
      }
      else if(b[i].equals("...-."))
      {
        r += "[Morse slang: Understood]";
      }
      else if(b[i].equals("-.-.-"))
      {
        r += "[Morse slang: Starting signal]";
      }
      else
      {
        e++;
        r += b[i]; //Unrecognized Morse "letters/phrases" will appear in their Morse form when translated
      }
    }
    if(e > 0)
    {
      JOptionPane.showMessageDialog(null,e+" Morse \"letter(s)\" weren\'t recognized. They "+
      "are kept the same in their encoded form","Obskewer",JOptionPane.WARNING_MESSAGE);
    }
    return r;
  }
}
