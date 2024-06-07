package javapackage;

public class Abstract {
	String name;
	String sex;
	String address;
	int fee;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			
			Abstract obj= new Abstract();
			obj.name="regina";
			obj.sex= "Male";
			obj.address="Virgania";
			obj.fee= 2000;
			
			System.out.println("Name Abstract "+obj.name);
			System.out.println("Sex of customer1 "+obj.sex);
			System.out.println("Address of customer1 "+obj.address);
			System.out.println("Fee of customer1 "+obj.fee);
			
	}

}
}
