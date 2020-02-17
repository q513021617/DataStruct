package AlgRecursion.Simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DecimalToBinary {

	static void toBinary(int data,List<Integer> intArry) {
		
		if(data<2) {
			intArry.add(data);
			System.out.print(data);
			return;
		}
		intArry.add(data%2);
		System.out.print(data%2);
		toBinary(data/2,intArry);
	}
	
	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<Integer>(); 
		toBinary(127,intList);
		System.out.println();
		
		for (int i=intList.size()-1;i>=0;i--) {
			System.out.print(intList.get(i));
		}
	}

}
