import java.util.Scanner;

//3244K,157MS
public class Main {
	
	  final static double PI = 3.1415926; 
	 
	  public static void main(String args[]) { 
		  
		  Scanner in = new Scanner(System.in);
		  int n = in.nextInt();
		  double data[][] = new double[n][2];
		  for (int i=0; i<n; i++) {
			  //System.out.println();
			  for (int j=0; j<2; j++) {
				  data[i][j] = in.nextDouble();
			      //System.out.print(data[i][j] + "  ");
			  }

		  }
		  double doR2 = 0;
		  double r2apy = 50*2/PI;
		  double year = 0;
		  for(int i=0; i<n; i++) {
			  doR2 = Math.pow(data[i][0], 2) + Math.pow(data[i][1], 2);
			  year = (doR2/r2apy);
			  System.out.println("Property " + (i+1) + ": This property will begin eroding in year " + (int)Math.ceil(year) + ".");
		  }
		  System.out.println("END OF OUTPUT.");


	  }
}

