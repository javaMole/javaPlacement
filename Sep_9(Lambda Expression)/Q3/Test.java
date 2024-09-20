interface Add
{
	int add(int b);
	int add(int a, int b);
}


class Test {
	public static void main(String[] args) {
		int a = 21;
		Add add = b -> b+b;
		System.out.println(add.add(a));
	}
}
/*
output 
we cannot implement a lamda expression to a non - functional interface 
Here Add interface is not a functional interface
*/