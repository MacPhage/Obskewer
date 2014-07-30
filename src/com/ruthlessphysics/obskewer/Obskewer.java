//
//  Obskewer.java
//
//  Java Source File
//
//  Created by Austin Jackson,
//
//  Further updates
//  http://srchub.org/u/mac
//

package com.ruthlessphysics.obskewer;

import javax.swing.*;

import com.ruthlessphysics.util.Debug;
import com.ruthlessphysics.util.Config;
import com.ruthlessphysics.obskewer.algorithm.*;

public class Obskewer
{
  public static String projectName = "Obskewer";
  static String version = "1.2.2, last updated June 15, 2014";
  static String changes = "- Added TrueCaesar cipher support\n"+
  "- Added Morse code cipher support\n"+
  "Patch #1:\n- Fixed repeated messages of invalid characters in Morse code\n"+
  "Patch #2:\n- Added Letter-Numbers cipher support\n";

  public static Config config = new Config("Obskewer");
  
  public static void main(String args[])
  {
    boolean debug = false;
    String operation;
    while(true)
    {

      if(debug == true)
      {
        config.getConfig();
        debug = false;
      }

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
        break;
        //Commented out because it could close every other Java program
        //System.exit(0);
      }
      else if(operation.equals("kill"))
      {
        System.exit(0);
      }
      else if(operation.equals("debug"))
      {
        Debug.alert("Debugging file ("+projectName+".properties) will be created if one doesn\'t exists already.\nDelete it to stop its effects on this program.","warning");
        debug = true;
      }
      else
      {
        JOptionPane.showMessageDialog(null,"That wasn\'t a valid operation.",projectName,JOptionPane.WARNING_MESSAGE);
      }
    }
  }
  public static void doEncode()
  {
    String in = JOptionPane.showInputDialog(null,"Encoding to a Cipher...\n"+
    "Ciphers: \'ClassicShift\', \'TrueCaesar\', \'Morse\', \'Numbers\', \'(none)\'\nType your cipher type of choice: ",
    "TrueCaesar");
    if(in.equals("ClassicShift"))
    {
      ClassicShift.performEncode();
    }

    else if(in.equals("TrueCaesar"))
    {
      TrueCaesar.performEncode();
    }
    else if(in.equals("Morse"))
    {
      Morse.performEncode();
    }
    else if(in.equals("Numbers"))
    {
      Numbers.performEncode();
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
    */
    else
    {
      JOptionPane.showMessageDialog(null,"That isn\'t a supported cipher.",projectName,JOptionPane.WARNING_MESSAGE);
    }
  }
  public static void doDecode()
  {
    String in = JOptionPane.showInputDialog(null,"Decoding from a Cipher...\n"+
    "Ciphers: \'ClassicShift\', \'TrueCaesar\', \'Morse\', \'Numbers\', \'(none)\'\nType your cipher type of choice: ",
    "TrueCaesar");
    if(in.equals("ClassicShift"))
    {
      ClassicShift.performDecode();
    }
    else if(in.equals("TrueCaesar"))
    {
      TrueCaesar.performDecode();
    }

    else if(in.equals("Morse"))
    {
      Morse.performDecode();
    }
    else if(in.equals("Numbers"))
    {
      Numbers.performDecode();
    }
    /*
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performDecode();
    }
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performDecode();
    }
    else if(in.equals("OtherCipher"))
    {
      OtherCipher.performDecode();
    }
    */
    else
    {
      JOptionPane.showMessageDialog(null,"That isn\'t a supported cipher.",projectName,JOptionPane.WARNING_MESSAGE);
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
    "Official website: http://srchub.org/p/obskewer\n"+
    "Some Java implementations of the algorithms are not coded by the author\n"+
    "of this program. Please view the Credits on the offcial website for the "+
    "original authors.\n\n"+
    "Changes in this version: \n"+changes,
    "About Obskewer",JOptionPane.INFORMATION_MESSAGE);
  }
}
