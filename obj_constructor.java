class abc{
	int a;
	abc(){
		a=7;
		System.out.println("Constructor Executed");
	}
	void display(){

	System.out.print(a);
	}
}
class obj_constructor{
	public static void main(){
	abc ob=new abc();
	abc o=new abc();
	ob.display();
	}
}