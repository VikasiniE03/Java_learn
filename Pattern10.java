import java.util.Scanner;
class Pattern10{
	public static void main(){
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
			System.out.print("* ");
		}
		System.out.println();
		}
	}
}