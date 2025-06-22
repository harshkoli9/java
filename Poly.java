/*package polymophism;

public class Poly {
	int add(int a, int b) {
		return a+b;
		
	}
	int add(int a, int b,int c) {
		return a+b+c;
			
	}
	int add(int a, int b,int c,int d) {
		return a+b+c+d;
	
    }

	public static void  main(String args[]) {
		Poly pp=new Poly();
		System.out.println("addition of a&b: "+pp.add(10,20));
		System.out.println("addition of a&b&c: "+pp.add(10,20,30));
		System.out.println("addition of a&b&c&d: "+pp.add(10,20,30,40));
	}
    }
*/

/*
class A1{
	void ride() {
		System.out.println("taxi");
	}zzzzzzzz
}
class B1 extends A1{
	void ride() {
		System.out.println("bus");
	}
}
class C1 extends B1{
	void ride() {
		System.out.println("train");
	}
}
class Poly{
	public static void  main(String args[]) {
		A1 aa =new A1();
		aa.ride();
		A1 aa1 =new B1();//UPCASTING OBJECT OF CHILD CLASS AND REFEENCE OF PARENT CLASS
		aa1.ride();
		A1 aa2 =new C1();
		aa2.ride();	
	}
}
*/
 class Customer
 {
	static int CustomerCount=0;
	String name;
	int id;
	
	Customer(String n,int i){
		name=n;
		id=i;
		CustomerCount++;
		System.out.println("custome name: "+name);
		
	}
	void  display() {
		System.out.println("customer id:"+id+ "name:" +name);
	}
 }


 class premiumCustomer extends Customer{
	 
	 double discrate;
	 premiumCustomer(String name,int id,double dis){
		 super(name,id);
		 discrate =dis;
		 System.out.println("premium csto name: "+name);
	 }
          
         @Override
	 void display() {
		 System.out.println("name: "+name+"id"+id+ "discrate:" +discrate);
	 }
	 
 }
 
 public class Poly {
	 public static void  main(String args[]) {
		 Customer c1= new Customer("harsh",100);
		 c1.display();
		 Customer c2= new premiumCustomer("hkoli",100,45.25);
		 c2.display();
	 }
	 
 }