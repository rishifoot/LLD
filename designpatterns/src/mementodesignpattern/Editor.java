package mementodesignpattern;

public class Editor {
    String text;
	int cursorX;
	int cursorY;
	int fs;
	String ff;
	
	
	EditorMemento getSnapshot() {
		return new EditorMemento(text,cursorX,cursorY,fs,ff);
		
	}
	void restore(EditorMemento em){
		this.text=em.getText();
		this.cursorX=em.getCursorX();
		this.cursorY=em.getCursorY();
		this.fs=em.getFs();
		this.ff=em.getFf();
		
	}
	void print() {
		System.out.println(text);
		System.out.println(cursorX);
		System.out.println(cursorY);
		System.out.println(fs);
		System.out.println(ff);
	}
		
	}


