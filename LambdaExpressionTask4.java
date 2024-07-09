//Write a Java program to implement a lambda expression to divide 2 numbers

package Java8_Task;

import java.util.function.BiFunction;

public class LambdaExpressionTask4 {
	public static void main(String[] args)
	{
		        
		        BiFunction<Integer, Integer, Integer> div= (a, b) -> a / b;

		       
		        int num1 = 60;
		        int num2 = 4;
		        int result = div.apply(num1, num2);

		        // Print the result
		        System.out.println("Result of dividing  is: " + result);
		
	}

}




