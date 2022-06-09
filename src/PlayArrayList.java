import java.util.ArrayList;

public class PlayArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> nos = new ArrayList();
		
		ArrayList <String> cars = new ArrayList();
		cars.add("i10");
		cars.add("i20");
		cars.add("swift");
		System.out.println(cars);
		System.out.println(cars.size());
		cars.remove(0);
		System.out.println(cars);
		cars.set(0, "quid");
		System.out.println(cars);
		System.out.println(cars.contains("quid"));
		System.out.println(cars.indexOf("quid"));
		System.out.println(cars.add("i20"));
		System.out.println(cars);
		for (String car : cars) {
			System.out.println(car);
		}
	
		
		
				
		
		
		
		

	}

}
