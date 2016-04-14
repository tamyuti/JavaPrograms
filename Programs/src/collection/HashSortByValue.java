package collection;

import java.util.*;
import java.util.Map.*;
 
public class HashSortByValue {
 
  public static void main(String a[]){
 
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("apple", 20);
    map.put("plum", 11);
    map.put("orange", 16);
    map.put("peach", 3);
    map.put("grape", 7);
 
    ArrayList<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>();
 
    Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
      public int compare( Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
        return (o2.getValue()).compareTo( o1.getValue());
      }
    });
 
    for(Map.Entry<String, Integer> entry:list){
      System.out.println(entry.getValue() + " " + entry.getKey());
    }
  }
}