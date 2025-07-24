package WrapperClasses;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		switch(s)
		{
		case "byte":
            System.out.println("Byte range:");
            System.out.println("min: " + Byte.MIN_VALUE);
            System.out.println("max: " + Byte.MAX_VALUE);
            break;
        case "short":
            System.out.println("Short range:");
            System.out.println("min: " + Short.MIN_VALUE);
            System.out.println("max: " + Short.MAX_VALUE);
            break;
        case "int":
            System.out.println("Integer range:");
            System.out.println("min: " + Integer.MIN_VALUE);
            System.out.println("max: " + Integer.MAX_VALUE);
            break;
        case "long":
            System.out.println("Long range:");
            System.out.println("min: " + Long.MIN_VALUE);
            System.out.println("max: " + Long.MAX_VALUE);
            break;
        case "float":
            System.out.println("Float range:");
            System.out.println("min: " + Float.MIN_VALUE);
            System.out.println("max: " + Float.MAX_VALUE);
            break;
        case "double":
            System.out.println("Double range:");
            System.out.println("min: " + Double.MIN_VALUE);
            System.out.println("max: " + Double.MAX_VALUE);
            break;
        default:
            System.out.println("Invalid input. Please enter a valid data type.");
    
			
			
		}

	}

}
