package mementodesignpattern;

public class EditorMemento  {
	private String text;
	private int cursorX;
	private int cursorY;
	private int fs;
	private String ff;
	public String getText() {
		return text;
	}
	public int getCursorX() {
		return cursorX;
	}
	public int getCursorY() {
		return cursorY;
	}
	public int getFs() {
		return fs;
	}
	public String getFf() {
		return ff;
	}
	EditorMemento(String text,int cursorX,int cursorY,int fs,String ff){
		this.text=text;
		this.cursorX=cursorX;
		this.cursorY=cursorY;
		this.fs=fs;
		this.ff=ff;
		
	}

	

}
