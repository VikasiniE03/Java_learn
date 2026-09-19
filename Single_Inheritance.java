class Father{
	String faname;
	Father(){
		faname="Eswaran";
	}
}
class Daughter extends Father{
	String name;
	Daughter(){
	name="Vikasini";
	}
	void name_of_daughter(){
	System.out.println(this.name + " " + faname);
	}
}
class Single_Inheritance{
	public static void main(String args[]){
	Daughter d=new Daughter();
	d.name_of_daughter();
	}
}