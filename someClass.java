/* This is a simple Java program. 
   FileName : "HelloWorld.java". */
class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
		// initial code:
        System.out.println("Hello, World"); 
		
		// New feature
		System.out.println(newFeatureMethod());
    } 
	
	public static String newFeatureMethod()
	{
		return "It's a new feature";
	}

    public static int returnValue()
	{
		return 0;
	}

    public static Object returnObject() {
        return new Object();
    }
} 