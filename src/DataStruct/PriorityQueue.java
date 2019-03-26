package DataStruct;

public interface PriorityQueue {

	int size();
	boolean isEmpty();
	Object getMin();
	Object removeMin();
	void add(Object element);
}
