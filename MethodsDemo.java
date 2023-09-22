package inheritenceDemeo;

public class MethodsDemo {
	
	int x=30;
	String str3="Jdbc";
	
	//method with return value
	
	public int sum()
	{
		int a =10;
		int b=20;
		int result= a+b+x;
		return result;
	}
	
	public String Concat() {
		String str1="selenium";
		String str2="Java";
		String result=str1 + str2 +str3;
		return result;
	}
	public void printmethod()
	{
		System.out.println("x value is:" +x);
		System.out.println("str3 is displayed:" +str3);
	}
	
	public static void main(String[] args) {
	
		
		MethodsDemo obj = new MethodsDemo();
		int z = obj.sum();
		String fan = obj.Concat();
				
	
		 obj.printmethod();

		System.out.println(z);
		System.out.println(fan);
		
		
		

	}

}