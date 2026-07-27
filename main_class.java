class first_class{
	int a,b,c;
	void sum(){
	c=a+b;
	System.out.println(c);
	}
}
class main_class{
	public static void main(){
	first_class obj=new first_class();
	first_class ob2=new first_class();
	obj.a=7;
	obj.b=7;
	obj.sum();
	ob2.a=77;
	ob2.b=77;
	ob2.sum();
	}
}