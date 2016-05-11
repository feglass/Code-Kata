import java.util.Scanner;

//3920K, 1500Ms, 1352B
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int num=0;
        
        if(m%2==0) {
        	num = m/2*n;
        	System.out.println(num);
        } else if(n%2==0) {
        	num = n/2*m;
        	System.out.println(num);
        } else {
        	num = (m*n-1)/2;
        	System.out.println(num);
        }
        
       
        	
		
		
		
      
        
	
	}
	
}
