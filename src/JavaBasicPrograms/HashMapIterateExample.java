package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIterateExample {

public static void main(String[] args) {

HashMap<String, String> hash_map = new HashMap<>();

hash_map.put("India", "New Delhi");
hash_map.put("France", "Paris");
hash_map.put("Germany", "Berlin");
hash_map.put("Australia", "Canberra");

// Iterator : Iterate by using keySet()
Iterator<String> it = hash_map.keySet().iterator();

while (it.hasNext()) {
String key = it.next();
String value = hash_map.get(key);
System.out.println("key: " + key + "==>" + "value: " + value);
}

System.out.println("**********************************");

// Iterate by using entrySet()

Iterator<Entry<String, String>> map_entry = hash_map.entrySet().iterator();

while (map_entry.hasNext()) {
Entry<String, String> entry = map_entry.next();
System.out.println("key: " + entry.getKey() + "==>" + entry.getValue());
}

}

}