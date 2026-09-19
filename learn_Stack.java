import java.util.Scanner;
class Stack{
	int [] stk=new int [10];
	int top;
	Stack(){
		top=-1;
	}

	void push(int x){
		if(top>10){
			System.out.println("Overflow");
		}
		else{
			stk[++top]=x;
		}
	}

	void pop(){
		if(top==-1){
			System.out.println("UnderFlow");
		}
		else{
			System.out.println(stk[top--]);
		}
	}
}

class learn_Stack{
	public static void main(){
		Stack ob=new Stack();
		ob.push(1);
		ob.push(12);
		ob.push(16);
		ob.push(7);
		ob.push(77);
		ob.push(1);
		ob.push(71);
		ob.push(1);
		ob.pop();
		ob.push(1);
	}
}