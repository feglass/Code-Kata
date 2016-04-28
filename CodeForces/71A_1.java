import java.util.Scanner;

//3920K, 1500Ms, 1352B
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len;
		
        for(int i=0; i<n; i++) {
        	String word = sc.next();
        	len = word.length();
        	if (len<=10) {
        		System.out.println(word);
        	} else {
        		System.out.println(word.charAt(0) + String.valueOf(len-2) + word.charAt(len-1));
        	}
        	
        }
        
	
	}
	
}
