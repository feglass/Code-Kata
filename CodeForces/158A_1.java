import java.util.Scanner;

public class HelloApp {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
  	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int a=0;
	    boolean flag=false;
	    int remain=-1;
	    int i=0;
    	for(i=0; i<n; i++){
    		if(flag == true) {
    			a = sc.nextInt();
    			if(remain==a)
    				continue;
    			else break;
    		} else
    			a = sc.nextInt();
    		
    		if(a==0) break;
    		if(i==(k-1)) {flag = true; remain = a;}
    	
    	  
    	}
    	System.out.println(i);

          
            
    }
}
