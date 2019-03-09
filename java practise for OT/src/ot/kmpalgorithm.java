package ot;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class kmpalgorithm {
public static void main(String[] args)
{
	Pattern p=Pattern.compile("[\\w]* ");
	Matcher m=p.matcher("praveen pavan pramothini"); 
	Boolean b=m.matches();
	System.out.println(b+" "+"hi");
	boolean c=Pattern.matches("..m", "aam");
	System.out.println(c);
	System.out.println(Pattern.matches("[^amn]", "ss"));
	System.out.println(Pattern.matches("[xyz]?", "axb"));
	System.out.println(Pattern.matches("[xyz]+", "xyz"));
	System.out.println(Pattern.matches("[xyza]*", "xxyyzaa"));
	System.out.println(Pattern.matches("[a-zA-z0-9]*", "1ahdjsjdsdkks dsdsd"));
	String s="paavvan  pramothini,pavan";
	String[] s1=s.split("(\\W)");
	for(String a:s1)
	System.out.println(a);



	
	
	
}
}
