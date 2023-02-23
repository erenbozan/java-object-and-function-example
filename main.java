package ödev;

import java.util.Scanner;

public class main {
	
	 public static void main(String[] args) {
		 islemler islemler = new islemler();
		 
		 islemler.cumleci();		//cümle input aldýran kod
		 islemler.kelimeci();		//cümleyi kelimelere bölüp listeye sokan kod
		 islemler.farklilik();		//listedeki kelimeleri hashset e aktaran kod 
		 islemler.adetci();			//sözcük frekanslarýný hesaplatma
		 islemler.max();			//en çok kullanýlan sözcüðü bulma
	 }
	

}
