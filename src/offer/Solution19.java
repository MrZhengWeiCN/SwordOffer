package offer;

import java.util.Iterator;
import java.util.LinkedList;

public class Solution19 {

	LinkedList<Integer> stack = new LinkedList<>();

	public void push(int node) {
		stack.addLast(node);
	}

	public void pop() {
		stack.removeLast();
	}

	public int top() {
		return stack.getLast();
	}

	public int min() {
		int min = stack.getFirst();
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			int temp = iterator.next();
			if (temp < min) {
				min = temp;
			}
		}
		return min;
	}
}
