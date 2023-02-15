package collection2;
import java.util.HashMap;
import java.util.Iterator;

public class UseBike2 {
	public static void main(String[] args) {
		Bike b1 = new Bike(9443,"pulsar","black",75000);
		Bike b2 = new Bike(9423,"KTM","orange",85000);
		Bike b3 = new Bike(9003,"SUZUKI","green",105000);
		Bike b4 = new Bike(9661,"yamaha","blue",95000);
		Bike b5 = new Bike(9455,"apache","white",88000);
		
		HashMap<Integer,Bike> bikes=new HashMap<> ();
		
		bikes.put(b1.getRegNo(), b1);
		bikes.put(b2.getRegNo(), b2);
		bikes.put(b3.getRegNo(), b3);
		bikes.put(b4.getRegNo(), b4);
		bikes.put(b5.getRegNo(), b5);
		
		Iterator<Integer> removeRegNo=bikes.keySet().iterator();
		while(removeRegNo.hasNext()) {
			System.out.println(removeRegNo.next());
		}
	//	Iterator<Bike> removeRegNo=bikes.values().iterator();
		//while(removeRegNo.hasNext()) {
		//	System.out.println(removeRegNo.next());
		//}
//		Iterator<Bike> removeRegNo=bikes.values().iterator();
//		while(removeRegNo.hasNext()) {
//			if(removeRegNo.next().getColor().equals("white")) {
//				removeRegNo.remove();
//			}  
//		}
//		
//		System.out.println(bikes);
//			
	}

}
