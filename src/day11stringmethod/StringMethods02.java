package day11stringmethod;

public class StringMethods02 {

	public static void main(String[] args) {
 //substring() methodu bir stringin belli bir bolumunu kesip almak icin kullanilir
   String str1 = "Java calisana kolaydir";
   //substring 1. versiyon
   System.out.println(str1.substring(5));//yazdigimiz index dahil kalani kesip alir"calisana kolaydir"
   System.out.println(str1.substring(8));//isana kolaydir index 8 dahildir
   System.out.println(str1.substring(22));//ekranda hicbirsey goremezsiniz
   //System.out.println(str1.substring(23));//index 23 yok ve ben olmayan yerden kesmek istiyrum
                                         //bu bir hatali istektir ve java exception verir.hata uyrisi
   System.out.println(str1.substring(0));//str1.substring(0)=str1 oldugundan str1.substring(0)hic kullanilmaz
   
   
  // substring() 2.versiyon
   System.out.println(str1.substring(5, 13));//ilk index dahildir ama ikinci index ekranda
   //goremezsiniz dahil degildir ekranda "calisana "yazdirir
   System.out.println(str1.substring(6, 12));//alisan
   System.out.println(str1.substring(6, 6));//ekranda hicbirsey goremezsiniz.busekilde kullanilmaz
   //System.out.println(str1.substring(7, 6));//buda yine hata veriri exception verir ilk index
                                           //herzaman kucuk veya esit olmali
   
   
   
	}

}
