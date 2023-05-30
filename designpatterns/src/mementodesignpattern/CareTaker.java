package mementodesignpattern;

import java.util.Stack;

public class CareTaker {
	private Stack<EditorMemento> st=new Stack();
	public void save(EditorMemento em) {
		st.push(em);
	}
	public EditorMemento undo() {
		return st.pop();
	}

}
