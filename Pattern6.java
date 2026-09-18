class Pattern6{
	public static void main(String args[]){
		int i,j,k;
		for(i=1;i<=5;i++){
			int ele=1;
			for(j=1;j<=5-i;j++){
				System.out.print(" ");}
				for(k=j;k<=5;k++){
					System.out.print(" "+ele++);
				}
				System.out.print("\n");
			}
		}
	}
	/*
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5*/