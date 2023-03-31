/* In Java, every application begins with a class definition. In the program, HelloWorld is the name of the class, and the class definition is:

class HelloWorld {
... .. ...
}


For now, just remember that every Java application has a class definition, and the name of the class should match the filename in Java.

public static void main(String[] args) { ... }

This is the main method. Every application in Java must contain the main method. The Java compiler starts executing the code from the main method.

For now, just remember that the main function is the entry point of your Java application, and it's mandatory in a Java program. The signature of the main method in Java is:

public static void main(String[] args) {
... .. ...
}

System.out.println("Hello, World!");
 

The code above is a print statement. It prints the text Hello, World! to standard output (your screen). The text inside the quotation marks is called String in Java.

*/

public class hello{
	public static void main(String[] args){
		System.out.println("Hello World");
	} 
}
/* Things to take away

    Every valid Java Application must have a class definition that matches the filename (class name and file name should be same).
    The main method must be inside the class definition.
    The compiler executes the codes starting from the main function.
*/
