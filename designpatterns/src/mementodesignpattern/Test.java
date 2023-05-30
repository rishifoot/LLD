package mementodesignpattern;

public class Test {

	public static void main(String[] args) {
		Editor ed=new Editor();
		ed.text="hello";
		ed.cursorX=10;
		ed.cursorY=12;
		ed.fs=30;
		ed.ff="camel";
		CareTaker ct=new CareTaker();
		EditorMemento em=ed.getSnapshot();
		ct.save(em);
		//ed.print();
		//ed.restore(ct.undo());
		//ed.print();
		ed.text+="world";
		ed.cursorX=30;
		ed.restore(ct.undo());
		ed.print();
	
		

	}

}
