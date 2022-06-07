
public class evenprint {

	public static void main(String[] args) {
		int n=54;
		String print=evenno(n);
		System.out.println(print);
		
		
		// TODO Auto-generated method stub

	}
	static String evenno(int n) {
		int i=0;
		String result="";
		while(i<=n) {
			if(i%2 ==0) {
				
				result =result+i;
			
				  if (i !=n) {
				    	result =result+',';
				}
			}
			i++;  
		}   
		    
		
	    return result;
	}

}
