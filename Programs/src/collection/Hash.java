package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Map;

public class Hash {
	HashMap<Integer, String> map=new HashMap<Integer, String>();
	public void create(){
		
		map.put(10, "Software Engineer");
		map.put(25, "Quality Engineer");
		map.put(5, "Marketing");
	}
	public void search(){
		for(Map.Entry m:map.entrySet()){
			if(m.getKey().equals(25)){
			System.out.println(m.getKey() +" " +m.getValue());
			}
		}
	}
	public void searchValue(){
		
        }
    
	      
		
	public static void main(String[] args) {
		Hash obj=new Hash();
		obj.create();
		obj.search();
	}
}
