import java.util.Scanner;
class first{
	int a,b,c;
	int sum(){
	c=a+b;
	return c;
	}
}
class second_user{
	public static void main(){
	first obj=new first();
	first ob2=new first();
	first ob3=new first();
	Scanner ob=new Scanner(System.in);
	obj.a=ob.nextInt();
	obj.b=ob.nextInt();
	int d=obj.sum();
	System.out.println(d);
	ob2.a=ob.nextInt();
	ob2.b=ob.nextInt();
	int e=ob2.sum();
	System.out.println(e);
	ob3.a=ob.nextInt();
	ob3.b=ob.nextInt();
	int f= ob3.sum();
	System.out.println(f);
}
}