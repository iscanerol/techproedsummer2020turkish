package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
//4 elemanli bir char array olusturun ,bu arraya elemanlar yerlerstirin 
//tum elemanlari for dongusuyle yazdirin
//son elemani yazdirin
		char arr1[] = new char[4];
		arr1[0]= 'a';
		arr1[1]='b';
		arr1[2]='d';
		arr1[3]='e';
		for(int i = 0; i<4; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(arr1[3]);
		//Array in length ini bulmak icin "ArrayIsmi.length"yazmak yeterlidir
		//Stringlerde de length methodu kullanilir ama Stringlerinki parantezlidir
		//yani Stringlerde==>length() Arraylarda ==>length
		System.out.println(arr1.length);
		//Arraydaki son elemani yazdirmak icin length kullanalim
		System.out.println(arr1[arr1.length-1]);
	}

}
