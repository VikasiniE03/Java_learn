class abc{
	int a;
	abc(int a){
		this.a=a;
	}
	void display(){
	System.out.println(a);
	}
}
class this_constructor{
	public static void main(){
	abc ob=new abc(2);
	abc o=new abc(9);
	ob.display();
	o.display();
	}
}