package 第八次作业;

import java.util.ArrayList;
public class MyStack {
	private ArrayList<Object> list = new ArrayList<>();
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public int getSize() {
		return list.size();
	}
	public Object peek() {
		return list.get(getSize() - 1);
	}
	public Object pop() {
		Object a=list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return a;
	}
	public void push(Object a) {
		list.add(a);
	}
	@Override
	public String toString() {
		return "stack:" + list.toString();
	}
	
}
