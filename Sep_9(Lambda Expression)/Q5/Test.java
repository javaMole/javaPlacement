@FunctionalInterface
interface Str
{
	int methodStr(String str);
}

class Test {
public static void main(String[] args) {
		String str-> str.compareTo("goolge");
		System.out.println(str);
	}
}
/*
output 

Here there is not functional interface target variable

(String str)->str.compareTo("google"); // it is valid
 String str->str.compareTo("google"); // it is not  valid
 str->str.compareTo("google"); // it is valid
String str is not valid


*/