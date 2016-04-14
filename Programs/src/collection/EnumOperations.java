package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class EnumOperations {
	public List<Month> getAllmonths(){
		List<Month> list=new ArrayList();
		list=Arrays.asList(Month.values());
		return list;
	}
	public static void main(String[] args) {
		EnumOperations e=new EnumOperations();
		List<Month> months=e.getAllmonths();
		for(Month m:months){
			System.out.println(m);
		}
	}
}

