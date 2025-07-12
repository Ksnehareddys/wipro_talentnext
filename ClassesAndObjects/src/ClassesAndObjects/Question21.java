package ClassesAndObjects;

import java.util.Optional;
import java.util.Scanner;

public class Question21 {
	String adress;
	String default_name = "India";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Question21 obj = new Question21();
		if(s.isEmpty())
		{
			obj.adress=null;
		}
		else
		{
			obj.adress=s;
		}
		
		Optional<String> n = Optional.ofNullable(obj.adress);
		System.out.println(n.orElse(obj.default_name));
	}

}
