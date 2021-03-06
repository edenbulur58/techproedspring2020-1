package day29_collections;

import java.util.Hashtable;

public class HashTable01 {

	public static void main(String[] args) {
		
		   Hashtable<Integer,String> hashTable = new Hashtable<>();
		 
		   hashTable.put(100, "Mark"); //{100=Mark}
 		   hashTable.put(101,"Amanda"); //{101=Amanda, 100=Mark}
		   hashTable.put(102,"Banu");  //{102=Banu, 101=Amanda, 100=Mark}
	       System.out.println(hashTable);//{102=Banu, 101=Amanda, 100=Mark}
	       
	       // remove(Object key) removes the key-value pair for the specified key
	       hashTable.remove(101);
	       System.out.println("After using remove(): " + hashTable);
	       
	       //get(Object key) returns the value for the specified key.
	       System.out.println(hashTable.get(102)); // Banu
	       
	       //containsKey(Object key): It is a boolean function which returns true or false 
	       //based on whether the specified key is found in the map.
	       System.out.println(hashTable.containsKey(100)); // true
	       System.out.println(hashTable.containsKey(101)); // false
	       
	       //isEmpty() is a boolean function which returns true or false 
	       //It checks whether the map is empty. 
	       System.out.println(hashTable.isEmpty()); // false
	       
	       //keySet()returns the Set of the keys fetched from the map.
	       System.out.println(hashTable.keySet()); //[100, 102]
	       
	       //values()returns a collection of values of map.
	       System.out.println(hashTable.values()); //[Banu, Mark]
	       
	       //size() Returns the size of the map
	       System.out.println(hashTable.size());// 2
	       
	       // clear() removes all the key and value pairs from the specified Map.
	       hashTable.clear();
	       System.out.println(hashTable); //{}     
	}
}
