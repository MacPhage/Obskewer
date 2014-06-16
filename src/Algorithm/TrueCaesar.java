//
//  TrueCaesar.java
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

package Algorithm;

import javax.swing.*;

public class TrueCaesar
{
  /* True Caesar
  // The true form of Caesar's Cipher
  */
  public static void performEncode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to encode: ","Julius Caesar rocks!");
    int key = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a key bewteen 0 and 25: ","4"));
    String out = JOptionPane.showInputDialog("Key (remember this!): \'"+key+"\'\nOriginal: \'"+in+"\'\nEncoded: ",encode(in,key));
  }
  public static void performDecode()
  {
    String in = JOptionPane.showInputDialog(null,"Enter something to decode: ","NYPMYW GEIWEV VSGOW!");
    int key = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a key bewteen 0 and 25: ","4"));
    String out = JOptionPane.showInputDialog("Input Key: \'"+key+"\'\nEncoded: \'"+in+"\'\nDecoded: ",decode(in,key));
  }
  public static String decode(String enc, int offset) {
		return encode(enc, -offset);
	}

	public static String encode(String enc, int offset) {
		offset = offset % 26 + 26;
		StringBuilder encoded = new StringBuilder();
		for (char i : enc.toLowerCase().toCharArray()) {
			if (Character.isLetter(i)) {
				int j = (i - 'a' + offset) % 26;
				encoded.append((char) (j + 'a'));
			} else {
				encoded.append(i);
			}
		}
    String result = encoded.toString();
		return result.toLowerCase();
	}
}
