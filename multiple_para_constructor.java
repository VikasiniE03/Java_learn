class abc{
	int a,c;
	char b;
	abc(int x,char y,int z){
		a=x;
		b=y;
		c=z;
	}
	void display(){
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}
class multiple_para_constructor{
	public static void main(){
	abc ob=new abc(2,'c',5);
	abc o=new abc(67,'h',88);
	ob.display();
	o.display();
	}
}