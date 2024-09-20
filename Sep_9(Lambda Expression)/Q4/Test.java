@FunctionalInterface
interface Str
{
	int methodStr(String str);
}

class Test {
public static void main(String[] args) {
		Str str = (String s) -> "2";
		System.out.println(str.methodStr("2"));
	}
}
/*
output 
 Here the return type of lamda expression is string but int the functional interface 
 Str it is  methodStr return type is 'int '
 because of return type mismatch it will give us compile time error as bad return type in lamda expression
*/