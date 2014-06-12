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

import java.awt.*;
import javax.swing.*;
import Algorithms.ClassicShift;

public class Obskewer
{
  static String titleText = "Obskewer";
  static String version = "1.1.0, last updated June 11, 2014";
  public static void main(String args[])
  {
    String operation;
    while(true)
    {
      operation = JOptionPane.showInputDialog(null,"Operations: \'encode\',\'decode\',"+
      "\'info\',\'quit\'\nType your operation of choice: ","encode");
      if(operation.equals("encode"))
      {
        doEncode();
      }
      else if(operation.equals("decode"))
      {
        doDecode();
      }
      else if(operation.equals("info"))
      {
        showInfo();
      }
      else if(operation.equals("quit"))
      {
        System.exit(0);
      }
      else
      {
        JOptionPane.showMessageDialog(null,"That wasn\'t a valid operation.",titleText,JOptionPane.WARNING_MESSAGE);
      }
    }
  }
  public static void doEncode()
  {
    String in = JOptionPane.showInputDialog(null,"Encoding to a Cipher...\n"+
    "Ciphers: \'ClassicShift\', \'(none)\'\nType your cipher type of choice: ",
    "ClassicShift");
    if(in.equals("ClassicShift"))
    {
      ClassicShift.performEncode();
    }
    /*
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performEncode();
    }
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performEncode();
    }
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performEncode();
    }
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performEncode();
    }
    */
    else
    {
      JOptionPane.showMessageDialog(null,"That wasn\'t a valid cipher.",titleText,JOptionPane.WARNING_MESSAGE);
    }
  }
  public static void doDecode()
  {
    String in = JOptionPane.showInputDialog(null,"Decoding from a Cipher...\n"+
    "Ciphers: \'ClassicShift\', \'(none)\'\nType your cipher type of choice: ",
    "ClassicShift");
    if(in.equals("ClassicShift"))
    {
      ClassicShift.performDecode();
    }
    /*
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performEncode();
    }
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performEncode();
    }
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performEncode();
    }
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performEncode();
    }
    */
    else
    {
      JOptionPane.showMessageDialog(null,"That wasn\'t a valid cipher.",titleText,JOptionPane.WARNING_MESSAGE);
    }
  }
  public static void showInfo()
  {
    JOptionPane.showMessageDialog(null,
    "Obskewer is a light-weight Java application for encoding and decoding text.\n"+
    "The common ciphers it supports can be found under the Encode and Decode screens.\n"+
    "\n"+
    "Version: "+version+"\n"+
    "Author: Austin Jackson\n"+
    "Official website: http://srchub.org/p/obskewer\n",
    "About Obskewer",JOptionPane.INFORMATION_MESSAGE);
  }
}
