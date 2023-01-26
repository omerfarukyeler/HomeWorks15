package Home_Works15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question4 {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(45);
		list.add(56);
		list.add(13);
		list.add(15);
		
		System.out.println(list);
		
		
		ListIterator<Integer> liste = list.listIterator();	
		
		while(liste.hasNext()) {
			
			int i =list.indexOf(liste.next());
			
			System.out.print(" "+list.get((list.size()-1)-i));
		}
		
		
		
	}

}
