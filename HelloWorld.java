
// single line comment

/**
	naming classess in java

	class names must not have white spaces example:	Hello world
	class names must not be a java keyword
	class names should not start with a number: 1helloWorld

	class names can have number and special chars like _,$

	class names follow pasacal case: HelloWorld, StudentDetailsManager


*/

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to java....");

		Greeting greeting = new Greeting();
		greeting.greet();
	}
}

class Greeting {
	void greet() {
		System.out.println("Hello World");
	}

	/*
	 * <access-specifier> <access-modifier> <return-type> <method-name> 	(<parameters>) {}
	 */
}
/**
 * Method naming conventions
 * 1. method names must not have white spaces
 * 2. method names are in lower camel case: greetUser, greetUserDetails
 */
