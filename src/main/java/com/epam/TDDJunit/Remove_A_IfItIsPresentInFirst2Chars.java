package com.epam.TDDJunit;

public class Remove_A_IfItIsPresentInFirst2Chars {

	public static Object del(String string) {
		int stringlen=string.length();
		String result="";
		if(stringlen>=1)
		{
			if(string.charAt(0)!='A')
				result=string;
			if(string.charAt(0)=='A') {
				if(stringlen>2)
					result=string.substring(1);
			}
			if(stringlen>=2&&string.charAt(0)=='A'&& string.charAt(1)=='A')
				result=string.substring(2);
			if(string.charAt(0)!='A'&&string.charAt(1)=='A')
				result=string.substring(0,1)+string.substring(2);
				
		}
		return result;
	}

}
