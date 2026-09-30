import java.util.Scanner;

class missing_sum{
	public static void main(){
	Scanner sc=new Scanner (System.in);
		int n=0,m=0;
		System.out.println("Enter n values:");
		n=sc.nextInt();
		int [] a=new int[n-1];
		System.out.println("Enter array values from 1 to n with one missing value:");
		for(int i=0;i<n-1;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			m+=a[i];
		}
		int v=(n*(n+1))/2;
		int f=v-m;
		System.out.println("Missing number: "+f);
	}
}