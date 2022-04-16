package Basics;

public class Loops {
	
	public static String d;
	public static int x,y;
	
	
	public static int j;
	
	
	public void marks(){
		
		int a =5;
		char b = 'd';
		String name = "sathish";
		String lname = "Kumar";
		String c = name+lname;
		 d = c;
		 System.out.println(d);

		
	}
	
	public void looping(){
		
		x=5;
		for(int i=0;i<x;i++){
			System.out.println("the valu is "+i);
		}
		
	}
	
	public void condition(){
		
		j=5;
		if(j==5){
			System.out.println("True");
		}else {
			System.out.println("this is wrong number and the value is "+j);
		}
	}
	
	public void bikes(){
		
		String []bike = {"pulzer","shine","fz","tvs","ktm"};
		System.out.println(bike[3]);
	}
	
	

	public static void main(String[] args) {

		Loops lop = new Loops();
		lop.bikes();
	
		
		

	}

}
