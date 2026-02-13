
//sum of array


import java.util.Scanner;




public class sum{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n ,sum=0;
		
		System.out.println("eneter the number of array");
		n=sc.nextInt();
		int[] arr =new int[n];
		System.out.println("elements"+n+"enter");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			
		
		}
		
		for(int i=0; i<n; i++) {
			sum+= arr[i];
		}
		System.out.println("the sum of the arrays :"+sum);
		
		
		sc.close();
	}

}
