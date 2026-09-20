class abc{
	int a;
	abc(int x){
		a=x;
	}
	void display(){
	System.out.println(a);
	}
}
class para_constructor{
	public static void main(){
	abc ob=new abc(2);
	abc o=new abc(9);
	ob.display();
	o.display();
	}
}