package collection2;
import java.util.HashMap;
import java.util.Iterator;

public class UseAdharCard {
	public static void main(String[] args) {
		AdharCard a1 = new AdharCard(974635279472l,"ravi","raju",true);
		AdharCard a2 = new AdharCard(974630000472l,"gayathri","elango",false);
		AdharCard a3 = new AdharCard(974634673472l,"srividhya","mohan",false);
		AdharCard a4 = new AdharCard(974635999472l,"selvam","ganesh",true);
		
		HashMap<Long,AdharCard>cards=new HashMap<>();
		cards.put(a1.getNumber(), a1);
		cards.put(a2.getNumber(), a2);
		cards.put(a3.getNumber(), a3);
		cards.put(a4.getNumber(), a4);
		
		Iterator<AdharCard>removeMale=cards.values().iterator();
		while(removeMale.hasNext()) {
			if(removeMale.next().getIsMale()==true) {
				removeMale.remove();
				}
		}
		System.out.println(cards);
		cards.forEach((x,y)->System.out.println(y.getName()));
//		int max=a1.getName().length();
//		String z="";
//		for(AdharCard x:cards.values()) {
//			if(x.getName().length()>=max) {
//				max=x.getName().length();
//				z=x.getName();
//			}
//		}
//		System.out.println(z);
	}

}
