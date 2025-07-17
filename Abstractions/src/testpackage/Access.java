package testpackage;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation f= new Foundation();
		//System.out.println(f.var1); private - inaccessible
		//System.out.println(f.var2); default - inaccessible
		//System.out.println(f.var3); protected - inaccessible
		System.out.println(f.var4);

	}

}
