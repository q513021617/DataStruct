package DataStruct;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedPriorityQueue implements PriorityQueue {
	LinkedList list;
	Comparator comparator;
	
	public LinkedPriorityQueue() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(Object element) {
		// TODO Auto-generated method stub
		if(list.isEmpty()||comparator.compare(element,list.get(list.size()-1))>=0) {
			list.add(element);
		}else {
			ListIterator itr=list.listIterator();
			while(itr.hasNext()&&comparator.compare(element,itr.next())>=0) {
				
			}
			itr.previous();
			itr.add(element);
		}
		
	}

	@Override
	public Object getMin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeMin() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}



}
