package collectionPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class HashMapDemo1 {
	HashMap hm=new HashMap();
	HashMap hm1=new HashMap();
	ArrayList al=new ArrayList();
	ArrayList al1=new ArrayList();
	public String saveCountry(String countryName,String Capital)
	{
		hm.put(countryName, Capital);
		hm1.put(Capital, countryName);
		al.add(countryName);
		al1.add(Capital);
		return Capital;
		
	}
	public String getCapital(String countryName)
	{
		if (hm.containsKey(countryName))
			return (String)hm.get(countryName);
		else
			return "Country Not found";
	}
	/*public void getCountry(String capital)
	{
		
		for(Map.Entry<String,String> entry : hm.entrySet())
		{
			String key=entry.getKey();
			String value=capital;
			 if(entry.getValue()==value)
			{
				System.out.println("The key:"+key);
				break;
			}
			else
				System.out.println("not a country");
				
		}
	}
	*/
	
	public static <K,V> K getKey(Map<K,V> map,V value)
	{
		
	
	for(K key:map.keySet())
	{
		
		if(value.equals(map.get(key)))
		{
			return key;
		}
	}
	return null;
	}	
	

public static void main(String []args)
{
	HashMapDemo1 hd=new HashMapDemo1();
	
	String value=hd.saveCountry("India","New Delhi");
	String value1=hd.saveCountry("Hariyana","Chandigar");
	String value2=hd.saveCountry("Manipur","Imphal");
	String value3=hd.saveCountry("MadhyaPradesh","Bhopal");
	String value4=hd.saveCountry("TamilNadu","Chennai");
	String value5=hd.saveCountry("Karnataka","Bangalore");
	String name=hd.getCapital("India");
	//hd.getCountry("Chennai");
	//Set set=hd.hm.keySet();
	Set set=hd.hm.entrySet();
	Iterator itr=set.iterator();
	System.out.println("hm Map:");
	
	while(itr.hasNext())
	{
		Map.Entry me=(Map.Entry)itr.next();
		System.out.print(me.getKey()+":");
		System.out.println(me.getValue());
	}
	Set set1=hd.hm1.entrySet();
	Iterator itr1=set1.iterator();
	System.out.println("hm1 Map:");
	System.out.println();
	
	while(itr1.hasNext())
	{
		Map.Entry me1=(Map.Entry)itr1.next();
		System.out.print(me1.getKey()+":");
		System.out.println(me1.getValue());
	}
	 
	
	
	//System.out.println(hd.hm1);
		System.out.println("get Country:"+name);
		System.out.println("get Capital:"+getKey(hd.hm,"Chennai"));
		
		System.out.println("CountryName of ArrayList:");
		@SuppressWarnings("rawtypes")
		ListIterator i2=hd.al.listIterator();
		System.out.println("Enter the Countries in arrayList:");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		ListIterator i12=hd.al1.listIterator();
		System.out.println("Enter the Capital in arrayList:");
		while(i12.hasNext())
		{
			System.out.println(i12.next());
		}
	
}
}
