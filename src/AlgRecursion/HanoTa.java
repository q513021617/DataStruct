package AlgRecursion;

import java.util.ArrayList;
import java.util.List;

public class HanoTa {

	static void moveHanoDToB(int maxCount,List<Integer> aArry,List<Integer> bArry,List<Integer> cArry){
		
		if(maxCount<2) {
			move(aArry, bArry);
			return;
		}else {
			moveHanoDToB(maxCount-1, aArry, bArry,cArry );
			move(aArry, bArry);
			moveHanoDToB(maxCount-1, cArry,aArry ,bArry );
		}
		
		for(int i=0;i<aArry.size()-1;i++) {
			
			cArry.add(aArry.get(i));
			aArry.remove(0);
		}
		
		moveHanoDToB(maxCount-1, cArry, bArry, aArry);
		
		
		
		
	}

	static void move(List<Integer> aArry,List<Integer> bArry) {
		
		for(int i=0;i<aArry.size();i++) {
			bArry.add(aArry.get(i));
		}
		int count=aArry.size();
		for(int i=0;i<count;i++) {
			aArry.remove(0);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aArry=new ArrayList<Integer>();
		List<Integer> bArry=new ArrayList<Integer>();
		List<Integer> cArry=new ArrayList<Integer>();
		aArry.add(1);
		aArry.add(2);
		aArry.add(3);
		
		System.out.println();
	}

}
