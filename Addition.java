class Addition 
{
	public static void main(String[] args) 
	{
		add(7,8);
		add(7.7,8.8);
		add(7,8,7.7);
	}
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("sum of " +a+" and "+b+" is : "+c);
	}
	public static void add(double a,double b)
	{
		double c=a+b;
		System.out.println("sum of " +a+" and "+b+" is : "+c);
	}
	public static void add(int a,int b,double c)
	{
		double d=a+b+c;
		System.out.println("sum of " +a+", "+b+ " and "+c+" is : "+d);
	}



}
