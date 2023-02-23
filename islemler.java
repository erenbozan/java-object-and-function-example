package ödev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class islemler extends main {
	
	String totalCumle;
	String[] kelimeListe;
	List<String> list=new ArrayList<String>();
	HashSet h = new HashSet();
    HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
    TreeMap tree = new TreeMap();
    
	
	public void cumleci() {
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("ilk cümlenizi giriniz:");
		String cumle1 = scan.nextLine();
		
		System.out.println("ikinci cümlenizi giriniz:");
		String cumle2 = scan.nextLine();
		
		System.out.println("üçüncü cümlenizi giriniz:");
		String cumle3 = scan.nextLine();
		
		totalCumle =cumle1+" "+cumle2+" "+cumle3;
		totalCumle = totalCumle.replaceAll("\\p{P}", "");  
	

	}
	
	public  void kelimeci() {
		
		kelimeListe = totalCumle.split(" ");
		
		for (int i=0; i < kelimeListe.length; i++)
	    {
	      list.add(kelimeListe[i].toLowerCase());						//toLowerCase ve list kullanýmý  
	    }
		System.out.println("***********************************");
		System.out.println("toplam girilen sözcük:"+list.size());
	}
	
	public void farklilik() {
		
		for(String kelime:list) {
			h.add(kelime);			
		}
		
		System.out.println("\nfarklý sözcük adedi:"+h.size());
	}

	public void adetci() {
		
		for(String word : kelimeListe) {
			
			String tempUCword = word.toLowerCase();

			if(hash_map.containsKey(tempUCword)) {
				hash_map.put(tempUCword,hash_map.get(tempUCword) + 1);
			}
			else {
				 
                hash_map.put(tempUCword, 1);
            }

		}

        System.out.println("sözcük frekanslarý : \n");
        
 
        for(HashMap.Entry<String, Integer> entry :  hash_map.entrySet()){
        	if(entry.getKey()!=null) {
            System.out.println(entry.getKey()  + "\t\t" + entry.getValue());
        
        	}
        }
	}
	
	public void max() {
		HashMap.Entry<String, Integer> maxEntry = null;

		for (HashMap.Entry<String, Integer> entry :  hash_map.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		System.out.println("************");
		System.out.println("en çok kullanýlan sözcük ve frekansý:"+maxEntry);
		
	}
	
}
