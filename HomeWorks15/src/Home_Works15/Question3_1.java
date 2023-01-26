package Home_Works15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question3_1 {
public static void main(String[] args) {
	
	
	List<Integer> list = new ArrayList<>();
	
	list.add(23);
	list.add(45);
	list.add(56);
	list.add(3);
	list.add(89);
	list.add(77);
	list.add(15);
	
	System.out.println(list);
	
	int a = 0;
	
	Iterator<Integer> Ilist = list.iterator();
	
	
	
	while (Ilist.hasNext()) {
		
		a=Ilist.next();
		
		if(a<10 || a>40 ) {
			
			Ilist.remove();
			
			
			
		}
		
		
	}
		
		System.out.println(list);
	
	
}
}
