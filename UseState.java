package collection2;
import java.util.HashMap;
import java.util.Iterator;

public class UseState {
	public static void main(String[] args) {
		State s1 = new State("tamilnadu","chennai","tamil","TN");
		State s2 = new State("andrapradesh","hyderabad","hindi","AP");
		State s3 = new State("maharashra","mumbai","marati","MH");
		State s4 = new State("karanataka","bangalore","telugu","KN");
		
		HashMap<String,State>states=new HashMap<>();
		
		states.put(s1.getCode(), s1);
		states.put(s2.getCode(), s2);
		states.put(s3.getCode(), s3);
		states.put(s4.getCode(), s4);
		
		for(String x:states.keySet()) {
		
		System.out.println(states.get(x));
		
//		Iterator<State> removeState=states.values().iterator();
//		while(removeState.hasNext()) {
//			if(removeState.next().getCode().equals("AP")) {
//				removeState.remove();
//			}
//		}
//		System.out.println(states);
//	}

		}
	}
}
