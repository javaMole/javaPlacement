class FunctionalInterface{
	
public static void main(String[] args) {
		int a = 21;
		
		Cube cube = b -> b*b*b;
		System.out.println(cube.cube(a));
	}
}

@FunctionalInterface
interface Cube
{
	int cube(int b);
}

/*
output of the program :

9261
*/