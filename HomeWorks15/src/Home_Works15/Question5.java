package Home_Works15;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Question5 {
	
	
	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<>();
			
		list.add("Ali");
		list.add("Veli");
		list.add("Can");
		list.add("Ayse");
		
		ListIterator<String> ıtr = list.listIterator();
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Silmek istediginiz ismi giriniz : ");
		
		String isim =scan.nextLine();
		
		
		String a ;
		while (ıtr.hasNext()) {
			
			a=ıtr.next();
			
			if(a.contains(isim)) {
				
				ıtr.remove();
				System.out.println("Bu isim LinkedList'de vardi ve silindi");
			break;
			}
			
			else {
				
				System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
				break;
			}
			
				
				
			}
		
			
	
		
		}
		
	}
	


