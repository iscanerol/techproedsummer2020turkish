package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {

		// Elemanlari A, B, ve C String'leri olan bir list olusturunuz
		//List iterator kullanarak bu elemanlari AW , BW , CW ye donusturunuz
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		//List iterator kullanarak bu elemanlari AW , BW , CW ye donusturunuz
		ListIterator<String>lit = list.listIterator();
		while(lit.hasNext()) {
			Object element = lit.next();
			lit.set(element + "W");
			
		}
		System.out.println(list);//AW BW CW
		lit.add("KEMAL");
		lit.add("can");
		System.out.println(list);
	}

}
