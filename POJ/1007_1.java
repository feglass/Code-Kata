import java.util.LinkedList;
import java.util.Scanner;

//3920K, 1500Ms, 1352B
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<String[]> lList = new LinkedList<String[]>();
		int len = sc.nextInt();
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			String str = sc.next();
	        if(i==0)
	        	lList.add(new String[]{str, inversion(str, len)});
	        else {
	        	int j;
	        	for(j=0; j< i;j++) {
                       int y = Integer.parseInt(lList.get(j)[1]);
                       int x = Integer.parseInt(inversion(str, len));
                       if(y>x) {
                    	   lList.add(j, new String[]{str, inversion(str, len)});
                    	   break;
                       }
	        	}
	        	if(j == i) {
	        		lList.addLast(new String[]{str, inversion(str, len)});
	        	}
	        }
			
		}
		
	    
	    for(int i=0; i<lList.size(); i++) {
			//System.out.println(lList.get(i)[0] + " " +  lList.get(i)[1]);
	    	System.out.println(lList.get(i)[0]);
		}
	}
	
	private static String inversion(String str, int len) {
		char[] ch=str.toCharArray();		
		int sum = 0;
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(ch[i] > ch[j])
					sum++;
			}	
		}		
		return Integer.valueOf(sum).toString();
	}

}
