package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//	Iterator Javada bir Interface�dir.
//.iterator methodu ba�ka bir objeyi interface�e uygun hale getirmektir.
//interface�de normalde Constructor olmaz, obje olu�turulamaz ama iterator methodu sayesinde 
//ba�ka yerde olu�turulmu� objeyi interface�de kullan�labilir haline getiriyor.
//.hasNext methodu bir sonraki elaman var m� yok mu, kontrol eder, eleman varsa true atar.
//System.out.print(iterator.next());// yazd�rmak i�in next methodunu kullanmam�z gerekiyor.
//.next methodu iterator�a git bir sonraki eleman� yazd�r demektir.
public class IteratorVeForEachLoop {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X,Y,Z]
		
		//Tipi Iterator interface olan iterator isimli bir obje
		//urettik, bu objeyi list1 kullanarak urettik
		Iterator<String> iterator = list1.iterator();
		//hasNext() methodu bir sonraki eleman var mi yok mu kontrol eder.
		// ==>X, Y, Z
		
		//Iterator ile for-each loop farki:
		//for-each loop elemanlar arasinda gecer ama collection'i degistiremez
		//iterator ise elemanlar arasinda gezer ve collection'i degistirebilir
		//for-each loop ile degisim yapmaya calisalim degisim olmaz
		for(String w:list1) {
			w = w+"A";
		}
		System.out.println(list1);//[X, Y, Z]
				
		//iterator ile degisim yapmaya calisalim degisim olur		
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();//remove() methodu eleman siler
		}
		System.out.println(list1);//[]
	}

}
