import java.util.Scanner;
class Smallest_of_three {
public static void main(){
	Scanner ob=new Scanner(System.in);
	int x,y,z;
	x=ob.nextInt();
	y=ob.nextInt();
	z=ob.nextInt();
	if(x<y &&x<z){
		System.out.print("Smallest = "+x);
	}
	else if(y<x && y<z){
		System.out.print("Smallest = "+y);
	}
	else{
		System.out.print("Smallest = "+z);
	}
}
}