//
//  Piglatin.java
//
//  Java Source File
//
//  Created by Austin Jackson,
//
//  Further updates
//  http://github.com/MacPhage
//

package com.ruthlessphysics.obskewer.algorithm;

import javax.swing.JOptionPane;
import com.ruthlessphysics.obskewer.Misc;

public class Piglatin
{
	// Piglatin
	// American elementary school at its finest.
	//
	
	public static final int sizeLimit = 4;
	public static final String suf = "ay"; //histay is the uffixsay
	
	public static void performEncode()
	{
		String in = JOptionPane.showInputDialog(null,"Enter something to encode: ","Connie has cooties");
		JOptionPane.showInputDialog("Original: \'"+in+"\'\nEncoded: ",encode(in));
	}
	public static void performDecode()
	{
		String in = JOptionPane.showInputDialog(null,"Enter something to decode: ","abcd");
		JOptionPane.showInputDialog("Encoded: \'"+in+"\'\nDecoded: ",decode(in));
	}
	public static String encode(String a)
	{
		a = a.toLowerCase();
		String[] words = a.split(" ");
		String result = "";
		String currentWord;
		
		for(int i = 0; i < words.length; i++)
		{
			currentWord = words[i];
			if(currentWord.length() >= sizeLimit)
			{
				result += currentWord.substring(1)+currentWord.charAt(0)+suf+" ";
			}
			else //Any word where the length is under the size limit, or is invalid
			{
				result += currentWord+" ";
			}
		}
		return result;
	}
	public static String decode(String a) //Custom parameters
	{
		//Necessary calculations
		return a;
	}
}
