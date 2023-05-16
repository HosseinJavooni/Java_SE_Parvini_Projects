public class Sample1_Wrapper{
	public static void main(String[] args){
		Integer a = new Integer(10);
		Integer b = new Integer("3");
		int c = a + b;
		System.out.println("c value is: " + c);

		//Autobox
		Integer num1 = 10;
		Integer num2 = 10;
		Integer num3 = new Integer(10);
		//unbox
		int d = num1;
		System.out.println("Our code is like this:\n" + 
		"//Autobox \n" + 
                "Integer num = 10; \n" +
                "//unbox\n"+
                "int d = num;");
		if(10 == num1)
			System.out.println("-> equals");
		else
			System.out.println("10 == num1 -> not equals");

		if(num1 == num2)
			System.out.println("num1 == num2 -> equals");
		else
			System.out.println("num1 == num2 -> not equals");

		if(num1.equals(num3))
			System.out.println("num1.equals(num3) -> equals");
		else 
			System.out.println("num1.equals(num3) -> not equals");

		if(num1 == num3)
			System.out.println("num1 == num3 -> equals");
		else
			System.out.println("num1 == num3 -> not equals");

		System.out.println("++++++++++++++++++");

		System.out.println("adding an Integer and int in java --> " + (d + num1));
	}
}
