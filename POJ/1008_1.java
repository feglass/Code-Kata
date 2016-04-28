import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//3920K, 1500Ms, 1352B
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int year, day, month, day_sum;
		String true_day;
		String[] haab_month = new String[] {"pop", "no", "zip", "zotz", "tzec", 
				                      "xul", "yoxkin", "mol", "chen", "yax",
				                      "zac", "ceh", "mac", "kankin", "muan",
				                      "pax", "koyab", "cumhu", "uayet"}; //19
		String[] tzolkin_day = new String[] {"imix", "ik", "akbal", "kan", "chicchan",
				                             "cimi", "manik", "lamat", "muluk", "ok",
				                             "chuen", "eb", "ben", "ix", "mem",
				                             "cib", "caban", "eznab", "canac", "ahau"};//20

		System.out.println(num);
		for(int i=0; i<num; i++) {
			int j;
			String tmp1 =sc.next();
			day = Integer.parseInt(tmp1.substring(0, tmp1.length()-1));
			//System.out.println("day = " + day);
			String tmp2 = sc.next();
			for(j=0 ;j<19; j++) {
				if(tmp2.equals(haab_month[j]))
					break;
			}
			month = j;
			//System.out.println("month = " + month);
			year = sc.nextInt();
			//System.out.println("year = " + year);
			
		    day_sum = year*365+month*20+day;
		   // System.out.println("day_sum = " + day_sum);
		    
		    year = day_sum/260;
		    day_sum = day_sum%260;
		    true_day = tzolkin_day[day_sum%20];	    
		    month = day_sum%13 + 1;
		    
		    System.out.println(month + " " + true_day + " " + year);
			
			
		}
		
	
	}
	
}
