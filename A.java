class A
{
	int a=10;
	String s="mahi";
	A()
	{
		System.out.println("constructer");
	}
	static 
	{

		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}
	 void m1()
	{
		System.out.println("m1 method");
	}
	static void m2()
	{
		System.out.println("static m2 method");
	}
	public static void main(String[] args) {
		System.out.println("main ");
		//A ob=new A();
		//System.out.println(ob.a);
		//System.out.println(ob.s);
		//ob.m1();
		A.m2();
	}
}