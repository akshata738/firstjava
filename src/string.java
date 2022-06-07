
public final class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Akshu";
		String s2="Ak";
		String s3="shu";
		String s4=s2+s3;
		String s5="Akshu";
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		System.out.println(s1==s5);//it will give true because concept stringPool because it has directly assigned value not derived
		
		
		
		

	}

}
