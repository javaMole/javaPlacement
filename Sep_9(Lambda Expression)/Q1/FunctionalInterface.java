class FunctionalInterface {
	
	public static void main(String[] args)
	{
		int a = 10;
		
		Add add = (int b) -> b;
		System.out.println(add.add(a));
	}
}

interface Add
{
	int add(int b);
}
/*
output of the program :

10
*/