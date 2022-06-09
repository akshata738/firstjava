
public class UseNextGenMainArray {
	public static void main(String[] args) {
		String [] cars = {"BMW","Swift","Audi"};
		NextgenArray<String> nextgenarray= new NextgenArray(cars);
		System.out.println(nextgenarray.get(1));
		System.out.println(nextgenarray.get(2));
		Integer[] nos = {1,2,3,4,5,6,};
		NextgenArray<Integer> nextgenarray1= new NextgenArray(nos);
		System.out.println(nextgenarray1.get(1));
		System.out.println(nextgenarray1.get(2));
		
		
		
		
		
		
		
		
	}

}
