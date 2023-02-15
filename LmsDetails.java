package collection2;
import java.util.HashMap;
public class LmsDetails {
	public static void main(String[] args) {
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(508,"vijayalakshmi");
		lms.put(1031,"hari");                 
		lms.put(1032,"rangesh");
		lms.put(1030,"satheesh");
		lms.put(1040,"muthu");
		
		//System.out.println(lms);
		//[print key only]
	//	for(Integer x:lms.keySet()) {
	//		System.out.println(x); 
	//	}
	//	for(String x:lms.values()) {
	//		System.out.println(x);
	//	}
	//	for(Integer x:lms.keySet()) {
	//		System.out.println(lms.get(x));
		//}
		lms.forEach((x,y)->System.out.println(x+" "+y));
	}

}
