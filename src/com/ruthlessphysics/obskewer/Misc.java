package com.ruthlessphysics.obskewer;

public class Misc
{
	public static String removePunctuation(String s)
	{
		s = s.replaceAll(",","");
		s = s.replaceAll("<", "");
		s = s.replaceAll(".'","");
		s = s.replaceAll(">","");
		s = s.replaceAll("/","");
		s = s.replaceAll("?","");
		s = s.replaceAll(":","");
		s = s.replaceAll(";","");
		s = s.replaceAll("\"","");
		s = s.replaceAll("\'","");
		s = s.replaceAll("{","");
		s = s.replaceAll("[","");
		s = s.replaceAll("}","");
		s = s.replaceAll("]","");
		s = s.replaceAll("|","");
		s = s.replaceAll("\\","");
		s = s.replaceAll("~","");
		s = s.replaceAll("`","");
		s = s.replaceAll("!","");
		s = s.replaceAll("@","");
		s = s.replaceAll("#","");
		s = s.replaceAll("$","");
		s = s.replaceAll("%","");
		s = s.replaceAll("^","");
		s = s.replaceAll("&","");
		s = s.replaceAll("*","");
		s = s.replaceAll("(","");
		s = s.replaceAll(")","");
		s = s.replaceAll("-","");
		s = s.replaceAll("_","");
		s = s.replaceAll("+","");
		s = s.replaceAll("=","");
		
		return s;
	}
	
	public static boolean hasPunctuation(String s)
	{
		String first = s;
		String last = removePunctuation(first);
		if(first.equals(last))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static boolean hasPunctuation(char c)
	{
		String first = Character.toString(c);
		String last = removePunctuation(first);
		if(first.equals(last))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
