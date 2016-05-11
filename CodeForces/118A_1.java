import java.util.Scanner;

//38400K, 280ms
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inStr = sc.next();
		int[] vowels = new int[]{65, 79, 89, 69, 85, 73};
		int len = inStr.length();
		StringBuilder sb = new StringBuilder();
		int flag=0;
		
		for(int i=0; i<len; i++) {
			
			char ch = inStr.charAt(i);
			//check if the letter is a vowel
			flag=0;
			for(int j=0; j<6; j++) {
				if(ch==vowels[j] || ch==(vowels[j]+32))
					flag=1;	
			}
			if (flag==1) continue;
			//check if the letter is a uppercase letter
			if (ch<='Z') ch=(char) (ch+32);
			//add to the result string
			sb.append("." + ch);	
			
		}
		
		System.out.println(sb.toString());
		
      
        
	
	}
	
}
