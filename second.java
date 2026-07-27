import java.util.Scanner;
class first{
	int a,b,c;
	void sum(){
	c=a+b;
	System.out.println(c);
	}
}
class second{
	public static void main(){
	first obj=new first();
	first ob2=new first();
	first ob3=new first();
	Scanner ob=new Scanner(System.in);
	obj.a=ob.nextInt();
	obj.b=ob.nextInt();
	obj.sum();
	ob2.a=ob.nextInt();
	ob2.b=ob.nextInt();
	ob2.sum();
	ob3.a=ob.nextInt();
	ob3.b=ob.nextInt();
	ob3.sum();

}
}