package JavaBasics.Automation;

import java.awt.List;
import java.util.*;

public class Patternprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name ="testing masters";

int len = name.length();
System.out.println(name);
System.out.println(len);

char c = name.charAt(5);
System.out.println(c);


int a = name.indexOf('s');
System.out.println(a);

int a1 = name.lastIndexOf('s');
System.out.println(a1);


String city = " hyderabad ";

System.out.println(city);

city=city.trim();

System.out.println(city);

String name1="deepthi";

String s1=name1.substring(3,6);
System.out.println(s1);


String st1 = "Deepthi Kotha";

String st2 = "deepthi";

boolean s3=st1.equalsIgnoreCase(st2);

System.out.println(s3);

boolean s4 =st1.contains("Deep");
System.out.println(s4);


String d="Deepthi: kotha :a : daug : hter" ;

String[] v= d.split(":");

System.out.println("Length of the string is:" +v.length);

System.out.println(v[0]);


System.out.println(v[1]);

System.out.println(v[2]);

System.out.println(v[3]);

String s5 = d.concat(name);
System.out.println(s5);


	}

}
 