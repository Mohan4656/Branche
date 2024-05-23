package loop;

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
			
			System.out.println("Hello Mohan");
			
			

}
}}