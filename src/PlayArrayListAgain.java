import java.util.ArrayList;
import java.util.Comparator;

public class PlayArrayListAgain {
	public static void main(String[] args) {
		ArrayList <Integer> nos = new ArrayList();
		nos.add(11);
		nos.add(13);
		nos.add(6);
		nos.add(8);
		nos.add(9);
		System.out.println(nos);
		nos.sort(null);
		System.out.println(nos);
		nos.sort(new DescendingComparator());
		System.out.println(nos);
		
		class DescendingComparator2 implements Comparator<Integer>{

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				
				
				return o2.compareTo(o1);
			}
//			
		}
		nos.sort(new DescendingComparator2());
		//anonymous inner class syntax
		nos.sort(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			});
		//lambda expression
		nos.sort((o1,o2) -> o2.compareTo(o1));
		System.out.println(nos);
	
	
	
	}
}
