import java.util.Scanner;
class Vote {
public static void main(){
	Scanner ob=new Scanner(System.in);
	int x,y;
	x=ob.nextInt();
	if(x>=18){
		System.out.print("Eligible to vote ");
	}
	else{
		System.out.print("Not eligible to vote ");}
	}
}