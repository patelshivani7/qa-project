package javapackage;

public class CustomerMethod {

	
		
		void fee_manual()
		{
			int a =400;
			System.out.println("The fee of manual is $"+a);
		}
		
		int automation()//constructer method .we can also use same method abov
		
		{
			
			return 550;
		}
		public static void main(String[] args) {
			
			CustomerMethod obj = new CustomerMethod();
			
			obj.fee_manual();
			
			System.out.println(obj.automation());
	}

}
