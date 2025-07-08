package ClassesAndObjects;

import java.util.*;

public class Question18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		ArrayList<String> str=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			str.add(sc.next());
		}
   StringJoiner sj=new StringJoiner(",","{","}");
   for (int i = 0; i < str.size(); i++) {
       sj.add(str.get(i));
   }
   System.out.println(sj);
	}

}
