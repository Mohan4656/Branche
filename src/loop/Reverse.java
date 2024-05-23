package loop;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Reverse {
	
public static void main(String[] args) {
		
		int no=123456,rev=0;
		 while(no!=0) {
			 
		//datatype variable = value (get last digit form number)
			int reminder = (no%10);    //123456%10   = 12345.6
			rev=(rev*10 + reminder);   //0*10+12345.6 = 12345.6
		
//	
		//in this method remove last digit from number
			
			no=(no/10);        //123456/10   = 12345.6
			
			System.out.print(reminder);

			
			Set s=new HashSet();
			s.add("Mohan");
			s.add(737339);
			s.add(123.369f);
			s.add(false);
			s.add(null);
			
			System.out.println(s);
			
			Set s1=new LinkedHashSet();
			s1.add("Chennai");
			s1.add(4656);
			s1.add(8184.555f);
			s1.add(true);
			s1.add('M');
			
			System.out.println(s1);
			
			s1.addAll(s);
			System.out.println(s1);
			
			s.removeAll(s1);
			System.out.println(s);
			
			s.retainAll(s1);
			System.out.println(s);
			
			s1.clear();
			System.out.println(s1);
			
			s.retainAll(s1);
			System.out.println(s);
			
			boolean contains = s.contains(737339);
			System.out.println(contains);
			
			
			



}
}}